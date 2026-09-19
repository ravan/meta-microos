SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "5.3"

RPM_NAME = "python313-libarchive-c-5.3-1.3.noarch.rpm"
RPM_HASH = "9dcc9be772e783ea5af9cb30f63971767b2876ff005b3ec6778ba0f175856bda7228b285ac4acbfa6a799ec919b0ceacd670d5ceed9e669a6a028856489455fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive-c \
python3.13dist-libarchive-c \
python313-libarchive-c \
python3dist-libarchive-c"

RDEPENDS:${PN} += "libarchive13 \
python-abi"

inherit rpm
