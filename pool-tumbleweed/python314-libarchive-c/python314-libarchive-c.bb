SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "5.3"

RPM_NAME = "python314-libarchive-c-5.3-1.3.noarch.rpm"
RPM_HASH = "59f249f7a7862851580df957de7dc17c42e5821b0d7e53fe867bae2b41d4d6d6742d91a3ba16134dcfeab8759640e803bfe38d41df3e15342737c22dee7d53d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libarchive-c \
python314-libarchive-c \
python3dist-libarchive-c"

RDEPENDS:${PN} += "libarchive13 \
python-abi"

inherit rpm
