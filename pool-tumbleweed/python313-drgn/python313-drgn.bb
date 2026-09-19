SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python. \
 \
This package contains the Python module."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "python313-drgn-0.1.0-1.4.aarch64.rpm"
RPM_HASH = "ff6fcc14c030adb0aded2ca643e0604fe419e818eb34eed2fd62cedb6906a47f2b01dab4864f1f765a8ff47848df6cf4ab5cae6fccf2e6f3318a8e6404d261b9"

RPROVIDES:${PN} += "python3-drgn \
python3.13dist-drgn \
python313-drgn \
python3dist-drgn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
libkdumpfile.so.12 \
liblzma.so.5 \
python-abi \
update-alternatives"

inherit rpm
