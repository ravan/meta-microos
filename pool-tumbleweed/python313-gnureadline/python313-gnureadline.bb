SUMMARY = "The standard Python readline extension statically linked against the GNU readline library"
DESCRIPTION = "The standard Python readline extension statically linked against the GNU readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "python313-gnureadline-8.3.3-1.5.aarch64.rpm"
RPM_HASH = "f96ed1830c26d060ab445d3d4e5537ce4e103ad8ea6ecc975ea2a26e4f45bffa5351d04d0cf95823e1c3aee6e7fae9e6b6e32de01d1ec6f3f6ba74841d6f12f5"

RPROVIDES:${PN} += "python3-gnureadline \
python3.13dist-gnureadline \
python313-gnureadline \
python3dist-gnureadline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
python-abi"

inherit rpm
