SUMMARY = "Network boot loader images in bootable USB, CD, floppy and GRUB formats"
DESCRIPTION = "iPXE is a network bootloader. It provides a direct \
replacement for proprietary PXE ROMs, with many extra features such as \
DNS, HTTP, iSCSI, etc. \
 \
This package contains the iPXE boot images in USB, CD, floppy, and PXE \
UNDI formats. EFI is supported, too."
LICENSE = "GPL-2.0-only"

PV = "2.0.0+git20260710.58ee55b3c"

RPM_NAME = "ipxe-bootimgs-2.0.0+git20260710.58ee55b3c-2.1.aarch64.rpm"
RPM_HASH = "274e5b7f9fb93a0bd64355fe4b75cc86ff5ea7b9ed4733278b912876fffe1a4e91a875ced97744d4828ced8f8679dd7760289710d26c7fdedbed218842dab8e4"

RPROVIDES:${PN} += "ipxe-bootimgs"

RDEPENDS:${PN} += ""

inherit rpm
