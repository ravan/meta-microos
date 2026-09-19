SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Wideband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrwb0-0.1.6-1.14.aarch64.rpm"
RPM_HASH = "4b8cea477053bfafbdedd4413787ec1180c540bd925034da59bd094c7c9f610b099144df41745b9386a302e516e9c48efcb3acdd7b54bb709c41d7e97b1e2e5c"

RPROVIDES:${PN} += "libopencore-amrwb.so.0 \
libopencore-amrwb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
