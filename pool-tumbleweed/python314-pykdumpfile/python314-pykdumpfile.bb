SUMMARY = "Python bindings to libkdumpfile"
DESCRIPTION = "Python bindings to libkdumpfile"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.5.1"

RPM_NAME = "python314-pykdumpfile-0.5.5.1-1.10.aarch64.rpm"
RPM_HASH = "e7d9b40e783bf6bbcdd95727411e3e3aa826df0874577c0adc76fc225fca1afef9c77b6d32df11797d2158fd90f330ea561d69622eb2d84c3f80813c88d193bc"

RPROVIDES:${PN} += "python3.14dist-pykdumpfile \
python314-libkdumpfile \
python314-pykdumpfile \
python3dist-pykdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.12 \
python-abi \
python314-cffi"

inherit rpm
