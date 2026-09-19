SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm64-efi-2.14-19.1.noarch.rpm"
RPM_HASH = "07de6d24347efd0f1a7f070225ad35ea6447f39e51118bad435881919bdb1df4984ccbc8b32a8e3f7ce0f5640853b8bcdb46bc0fd075adb5b67ed3c3a8e52ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2-common"

inherit rpm
