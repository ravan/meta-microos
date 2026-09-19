SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-efi-2.14-19.1.noarch.rpm"
RPM_HASH = "a6a316737d90d1238cb093d936a540dc59331e35c874ce587c52f7651f4d143c3830a955cc910b6e16b4d37a04d885e7ff224ea8f169608642944329367d3ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2-common"

inherit rpm
