SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "vlc-jack-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "af961694b12b4e38c2ec85b32f1239d6196a8825a7d1efc09654af820f7e95d565069e1ca70dbdf097e67f9d083d624ef94509d56da32b2b9cd139d02107fd2d"

RPROVIDES:${PN} += "libaccess-jack-plugin.so \
libjack-plugin.so \
vlc-jack"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libm.so.6 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
