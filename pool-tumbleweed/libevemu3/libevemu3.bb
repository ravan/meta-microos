SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "libevemu3-2.7.0-4.5.aarch64.rpm"
RPM_HASH = "747c8f87a0b5a237281ef573d12016bbfcca43cfd308191658be843ce52d948d4774e989bd2a0b2e414ad2041ee0e5331725c823b77b1090095c58eacc764abe"

RPROVIDES:${PN} += "libevemu.so.3 \
libevemu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2"

inherit rpm
