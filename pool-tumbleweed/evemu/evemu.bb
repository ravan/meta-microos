SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-2.7.0-4.5.aarch64.rpm"
RPM_HASH = "e6a4fadeeb866a1295310f998a7de91adfb5b0428391c56695603e1d1e3237e7a0614fe8802ec8af11fad11387ab6642c59ab25b96e47dfeabbbebfa488b1c57"

RPROVIDES:${PN} += "evemu \
evemu-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libevemu.so.3"

inherit rpm
