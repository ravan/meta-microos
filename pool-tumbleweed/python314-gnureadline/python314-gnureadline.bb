SUMMARY = "The standard Python readline extension statically linked against the GNU readline library"
DESCRIPTION = "The standard Python readline extension statically linked against the GNU readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "python314-gnureadline-8.3.3-1.5.aarch64.rpm"
RPM_HASH = "05253a0d8b2a4116066b5258492cf273df72eb94c3eb54bcdcc34479ef90c5e6c5be9a539ad6d978829c2a17fef36034d5d85499e85b5ab570bf32903d13396b"

RPROVIDES:${PN} += "python3.14dist-gnureadline \
python314-gnureadline \
python3dist-gnureadline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
python-abi"

inherit rpm
