SUMMARY = "Bandwidth usage bar"
DESCRIPTION = "bwbar is a small program that generates a text and a graphical readout \
of the current bandwidth use to be displayed on a web page. \
 \
It is used, among others, at http://www.kernel.org/. \
 \
Authors: \
-------- \
    H. Peter Anvin <hpa@zytor.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "bwbar-1.2.3-9.11.aarch64.rpm"
RPM_HASH = "72ac7efe9944d3d55a4fb450ab13de1b6ddacc95f6ffd7f8c96e8ac2aa804427b77a1d572248278fad57610f55287aeffd1c991bf14546b15497ae476a7ed17d"

RPROVIDES:${PN} += "bwbar"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
systemd"

inherit rpm
