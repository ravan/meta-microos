SUMMARY = "PXE and EFI ROMs for QEMU network devices"
DESCRIPTION = "This package contains the iPXE ROMs (legacy PXE and EFI) compiled specifically \
for QEMU emulated network devices."
LICENSE = "GPL-2.0-only"

PV = "2.0.0+git20260710.58ee55b3c"

RPM_NAME = "ipxe-qemu-2.0.0+git20260710.58ee55b3c-2.1.aarch64.rpm"
RPM_HASH = "0184bd406d9f664bbffe25111e023b7b5bb096ab9c7ffb0f95b8fa82424b32895a12bc7786da0c51719aadad12e5740e3ec52fb02fbbe5408f4b1fc588a7d3ba"

RPROVIDES:${PN} += "ipxe-qemu \
ipxe-qemu-roms \
qemu-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
