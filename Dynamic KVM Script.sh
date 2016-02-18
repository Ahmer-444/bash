# Author: Ahmer Malik
# Company: Techknox System
# Version: 0.2
# Description:This script is used create a kvm using VM-builder. Follow the link for understanding : https://www.howtoforge.com/creating-virtual-machines-for-xen-kvm-vmware-workstation-6-vmware-server-with-vmbuilder-on-ubuntu-8.10-p2

#!/bin/bash 

# Name of KVM you want to build
VM_NAME=WEB-SERVICE
# Path of KVM, where to build
_PATH=/home/ahmer/Ahmer/Techknox/KVM_Images/$VM_NAME

mkdir -p $_PATH/mytemplates/libvirt/
cp /etc/vmbuilder/libvirt/* $_PATH/mytemplates/libvirt/
echo root 10000 > $_PATH/vmbuilder.partition
echo swap 2000 >> $_PATH/vmbuilder.partition
echo /var 5000 >> $_PATH/vmbuilder.partition
echo apt-get update --apt-get install -qqy --force-yes openssh-server >> $_PATH/boot.sh
sudo chmod +x $_PATH/boot.sh
cd $_PATH

# Commands used to create the Ubuntu:Trusty KVM
vmbuilder kvm ubuntu --suite=trusty --flavour=virtual --arch=amd64 --mirror=http://de.archive.ubuntu.com/ubuntu -o --tmpfs=- --libvirt=qemu:///system --ip=192.168.122.10  --part=vmbuilder.partition --templates=mytemplates --user=ahmer --name=ahmer --pass=ahmer --addpkg=vim-nox --addpkg=unattended-upgrades --addpkg=acpid --addpkg=linux-image-generic --firstboot=$_PATH/boot.sh --mem=1024 --cpus=1 --hostname=$VM_NAME 


# After the installation, install ssh & vim into your VM.
# Your IP address should be as similar to bridge like (virbr0 = 192.168.122.1)
# Add route for default GW. 
# sudo route add default gw 192.168.122.1
# Edit /etc/resolv.conf
