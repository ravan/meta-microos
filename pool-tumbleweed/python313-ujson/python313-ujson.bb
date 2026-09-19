SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "python313-ujson-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "d5e84bfe34c24f6cfc7fe292a3e82426d8505c62b019aa7813c7c007510cbbc696031a52208e3c4f05aaf7fed622b81a1440eaf75fd829d11069e214d1209b13"

RPROVIDES:${PN} += "python3-ujson \
python3.13dist-ujson \
python313-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
