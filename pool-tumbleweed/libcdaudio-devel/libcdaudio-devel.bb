SUMMARY = "Header files for libcdaudio, a library to control operation of a CD-DA"
DESCRIPTION = "libcdaudio is a library providing functions to control \
operation of a CD-ROM when playing audio CDs.  It also contains \
functions for CDDB and CD Index lookup."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.12p2"

RPM_NAME = "libcdaudio-devel-0.99.12p2-2.18.aarch64.rpm"
RPM_HASH = "13e99533417818265e3bad040da1e1232ab8dd4d0c8ff719114ca6d9fa1c14655c24f4c7267137e6a58eb1e66c63ea8cc4e484ac0e26637626d8f44dcc3615de"

RPROVIDES:${PN} += "libcdaudio-devel \
pkgconfig-libcdaudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcdaudio1"

inherit rpm
