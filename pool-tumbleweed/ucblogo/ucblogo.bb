SUMMARY = "Berkeley Logo interpreter"
DESCRIPTION = "Berkeley Logo interpreter is a free (both senses) interpreter for the Logo \
programming language."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.5"

RPM_NAME = "ucblogo-6.2.5-1.9.aarch64.rpm"
RPM_HASH = "6094c111b0bf1531383a8431d2218c53cd65331be30d57ec65a60c97a76602a81ea44db03bd0b1fd99be7357b6906ad4acce76838e650afe3101dd4950761a8b"

RPROVIDES:${PN} += "ucblogo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0"

inherit rpm
