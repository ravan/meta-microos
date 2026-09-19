SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for uboot systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-uboot-2.14-19.1.noarch.rpm"
RPM_HASH = "993aefb014c0c57d692163b2e5fb66540f71413b376a2ce1b1f35f3a39814ff974bcee0b1118a589f58cb39e859cd464710ec317591d32e9ccfc097d33ef70e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-uboot"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2-common"

inherit rpm
