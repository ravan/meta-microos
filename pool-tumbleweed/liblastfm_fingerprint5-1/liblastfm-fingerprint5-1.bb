SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm_fingerprint5-1-1.1.0-2.7.aarch64.rpm"
RPM_HASH = "cd42f89c7e90c3e91c11e215b00991cc419c4c538a21b078075172d032abf35f5fd08d8e47498b2ee523f50d733aa0bc7d6fd3d903f5d9ccb84ec95f7615acb6"

RPROVIDES:${PN} += "liblastfm-fingerprint5-1 \
liblastfm-fingerprint5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
liblastfm5.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
