SUMMARY = "A minimal MicroOS image, assembled from openSUSE's own signed RPMs"
DESCRIPTION = "Every package in this image is an openSUSE binary RPM, downloaded \
from download.opensuse.org and passed through untouched. Nothing is recompiled, \
the vendor signature on each file still verifies, and no poky recipe contributes \
a single file. BitBake's job here is assembly, not building."
LICENSE = "MIT"

# The package list lives beside the layer's other configuration, because
# scripts/microos-sysroot reads the same file to decide which recipes to link.
require conf/image-packages.inc

# scripts/microos names each recipe after the lower-cased package, so the list
# has to be spelled BitBake's way here. rpm.bbclass turns it back into the real
# openSUSE name before dnf ever sees it.
IMAGE_INSTALL = "${@' '.join(sorted(p.lower().replace('_', '-') for p in d.getVar('MICROOS_IMAGE_PACKAGES').split()))}"

# An initramfs is the honest first target. The generic openSUSE kernel has
# virtio-blk, ext4 and btrfs as modules rather than built in, so a disk root
# needs an initrd to load them first; a cpio the kernel unpacks into its own
# rootfs needs nothing loaded at all and exercises the same userspace.
IMAGE_FSTYPES = "cpio.gz ext4"

# This image exists to be booted and looked at, so the serial console logs
# straight in. See the comment on MICROOS_SERIAL_AUTOLOGIN in the class.
MICROOS_SERIAL_AUTOLOGIN = "1"

inherit microos-image
