SUMMARY = "Ammonia HTML sanitizer Python binding"
DESCRIPTION = "Ammonia HTML sanitizer Python binding"
LICENSE = "MIT"

PV = "0.3.6"

RPM_NAME = "python314-nh3-0.3.6-1.4.aarch64.rpm"
RPM_HASH = "8132c14ceae586dd7016fad10b85f5ed12e8c43bd03e75b787cfa36c01dc8876a20a16a6cbc935f48f08d648e44edb6704a6af81a5aa7b15d1db57432c557fcd"

RPROVIDES:${PN} += "python3.14dist-nh3 \
python314-nh3 \
python3dist-nh3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
