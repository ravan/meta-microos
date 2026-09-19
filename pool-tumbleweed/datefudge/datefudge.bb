SUMMARY = "A preload library to fake system time"
DESCRIPTION = "This program fakes the system date so that programs think the \
wall clock is different. The faking is not complete; timestamp \
on files are not affected in any way."
LICENSE = "GPL-2.0-or-later"

PV = "1.27"

RPM_NAME = "datefudge-1.27-1.5.aarch64.rpm"
RPM_HASH = "f319299989d9e3b55fdf39ad0045217541f766cea168933778b4d1e65067b340a9984166a10ed8979b7eaa749f917ba80e0d18939baf6e28e1eb68c6e5cf8578"

RPROVIDES:${PN} += "datefudge"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
