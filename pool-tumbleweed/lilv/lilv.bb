SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.28.0"

RPM_NAME = "lilv-0.28.0-1.3.aarch64.rpm"
RPM_HASH = "28fc3d49d7c61004f6a9f3697dca645cd787d32b26b50caf753a1e449e5bfb5ce3d0c39a0a624e4ab768c7b49a16a06661e1a7b03f37d558f786b6690f8a6e90"

RPROVIDES:${PN} += "lilv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblilv-0-0 \
liblilv-0.so.0 \
libsndfile.so.1"

inherit rpm
