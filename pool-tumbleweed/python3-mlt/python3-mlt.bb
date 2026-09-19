SUMMARY = "Python bindings for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
This package contains python bindings."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "python3-mlt-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "d94cfc01a88c32dda1c083b0905b730e4adb2f08f7fb873279a53f16e5d11a3bd35d1fe748fc06771c11443bd0a44c65865daee48e80534d07733b641b3cf3e7"

RPROVIDES:${PN} += "python3-mlt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
