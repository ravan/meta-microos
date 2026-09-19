SUMMARY = "Core partio libraries"
DESCRIPTION = "The python3-partio contains Python 3 binding for the library."
LICENSE = "BSD-3-Clause"

PV = "1.20.0"

RPM_NAME = "python3-partio-1.20.0-1.4.aarch64.rpm"
RPM_HASH = "dfba0153369f2a436bb272462f83b0787cfe45249ab19059c9cdbe99ab096fc8e560d100a25688d1b8410b307fa946583fa7d432c12edafff1ad06a1523dc4c5"

RPROVIDES:${PN} += "python3-partio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpartio.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
partio \
python-abi"

inherit rpm
