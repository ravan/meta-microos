SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.53.0.0"

RPM_NAME = "python314-apsw-3.53.0.0-1.4.aarch64.rpm"
RPM_HASH = "e89a06a570d1f5f10c31e35b3a8b3ac2f49c3fa6c0b07789746cb12d0605ef39ca363e58d55e545c65ec00d9b38fe22ba687626e86d407de238910cf422b3c79"

RPROVIDES:${PN} += "python3.14dist-apsw \
python314-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
