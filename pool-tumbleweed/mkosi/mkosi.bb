SUMMARY = "Build bespoke OS Images"
DESCRIPTION = "A fancy wrapper around 'dnf --installroot', 'apt', 'pacman', and 'zypper' that \
generates disk images with a number of bells and whistles. \
 \
Generated images are tailored to the purpose: GPT partitions, \
systemd-boot or grub2, images for containers, VMs, initrd, and extensions. \
 \
mkosi can boot an image via QEMU or systemd-nspawn, or simply start a shell in \
chroot, burn the image to a device, connect to a running VM via ssh, extract \
logs and coredumps, and also serve an image over HTTP. \
 \
See https://mkosi.systemd.io/ for documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "27"

RPM_NAME = "mkosi-27-3.1.aarch64.rpm"
RPM_HASH = "11488e965fdadaccc63fd7052fc0611e7ec4dbbe54b79d0fc784d39755d1cd6f4e5d9e131a32ae64fa3230f7e0c8d34ec64be4e333411be5acdfd4242721a645"

RPROVIDES:${PN} += "mkosi \
python3.13dist-mkosi \
python3dist-mkosi"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
distribution-gpg-keys \
python-abi \
python3 \
zypper"

inherit rpm
