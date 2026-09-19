SUMMARY = "Development files for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the development files."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-devel-2.7.0-4.5.aarch64.rpm"
RPM_HASH = "ece56ae14b24c522c4a1d1f7b24a0b66e71191081d7ae9b164dcc6ac15809842e9da4acb6bbf8b5335aa6346214aa04bd62f714ce9b687a918b02cd2175af6a7"

RPROVIDES:${PN} += "evemu-devel \
pkgconfig-evemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evemu \
libevemu3 \
pkgconfig-libevdev"

inherit rpm
