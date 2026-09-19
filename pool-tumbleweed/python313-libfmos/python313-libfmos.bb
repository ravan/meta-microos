SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "python313-libfmos-20260520-1.8.aarch64.rpm"
RPM_HASH = "7aec6d6f80d726984b7434de12df6f2f484726ad250b244ab9f971840720a6577e6eb212eb28f8d7cac49ae0dfe770cfdad7b37955e36c6cb9a434fd62baeaf1"

RPROVIDES:${PN} += "python3-libfmos \
python313-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
