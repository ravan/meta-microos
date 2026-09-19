SUMMARY = "Tools for creating and handling precompiled .mpy files for MicroPython"
DESCRIPTION = "MicroPython tools like the mpy-cross compiler for compiling.py files to .mpy files. \
Also mpy-tool for inspecting .mpy files."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "mpy-tools-1.28.0-2.3.aarch64.rpm"
RPM_HASH = "466ef6f3479e23684daf8d0055ddca65f339416f4ebb240c09473e0975ca44913c64173169c117a216824b3bdc24cf2b743dafecee0bc4cc10bbbb0b27ae7551"

RPROVIDES:${PN} += "mpy-cross \
mpy-tool \
mpy-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
