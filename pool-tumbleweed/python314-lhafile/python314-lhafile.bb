SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python314-lhafile-0.3.1-1.7.aarch64.rpm"
RPM_HASH = "d00b15d368b071883e0b80512559005c41f7027d5e58c3c80f897f0080dd99bcb1b179930a8ecc287f6ff3f017edc2477ed8cddc02b96b32327daf51f5b872a4"

RPROVIDES:${PN} += "python3.14dist-lhafile \
python314-lhafile \
python3dist-lhafile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
