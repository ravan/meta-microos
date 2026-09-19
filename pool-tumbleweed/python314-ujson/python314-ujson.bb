SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "python314-ujson-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "b91ea68d8ae20687aaf89b342bfb037a092f59fb827b887fc03b812e41cc9827d61a478fec16ae15afd8fec6fdc8dcdad0a7f8da31e536250e5985af16e75ee9"

RPROVIDES:${PN} += "python3.14dist-ujson \
python314-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
