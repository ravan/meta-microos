SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.53.0.0"

RPM_NAME = "python313-apsw-3.53.0.0-1.4.aarch64.rpm"
RPM_HASH = "813ddad09d1224d09886d92ed638d7340fab22120122f7c47bb4d93213abbdefb7754f69e2079cc301306a28f05f53959cf672d5619e8531b4e63db461efa1e8"

RPROVIDES:${PN} += "python3-apsw \
python3.13dist-apsw \
python313-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
