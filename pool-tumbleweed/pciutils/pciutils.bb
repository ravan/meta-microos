SUMMARY = "PCI utilities for the Linux Kernel"
DESCRIPTION = "lspci: This program displays detailed information about all PCI busses \
and devices in the system, replacing the original /proc/pci interface. \
 \
setpci: This program allows reading from and writing to PCI device \
configuration registers. For example, you can adjust the latency timers \
with it. \
 \
update-pciids: This program downloads the current version of the \
pci.ids file."
LICENSE = "GPL-2.0-or-later"

PV = "3.14.0"

RPM_NAME = "pciutils-3.14.0-2.4.aarch64.rpm"
RPM_HASH = "538fa7d45ce5ab4f141c3ced1677ca5578b5f4a6dedce024904bb812d05e699fb7c90771680ca01ad8cd5060311b7fe1433bb2f92bcc4a82135ebb8137772b3d"

RPROVIDES:${PN} += "pciutils"

RDEPENDS:${PN} += "hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libpci.so.3 \
libpci3"

inherit rpm
