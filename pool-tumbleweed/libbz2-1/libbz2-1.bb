SUMMARY = "The bzip2 runtime library"
DESCRIPTION = "The bzip2 runtime library"
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-1-1.0.8-6.1.aarch64.rpm"
RPM_HASH = "3c7b65089ecc32e78d645a499c96a02e0b69583bee517a4b740866995262f93e726d3421207c1c18e722c1d3b2ec4b87c66c25ce1ccc45afb4643cbd4df469bf"

RPROVIDES:${PN} += "libbz2-1 \
libbz2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
