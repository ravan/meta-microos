SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python. \
 \
This package contains the Python module."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "python314-drgn-0.1.0-1.4.aarch64.rpm"
RPM_HASH = "9344bb7c9dd8332c4851d7f8fa4fe872400bb4024bd00b5bdbf203ba4fc5e9e300164d8c385328eaa6fbca76ab75580ad84dc29d0fccb55f4e0be47e374d448f"

RPROVIDES:${PN} += "python3.14dist-drgn \
python314-drgn \
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
