SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "libLTO20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "ca3c1a3437d2b9fee7b5c66e1cb5876f3377f73c24fec7c5bec01260ff76d96b7ac92eed581a3ffe48e4cbbcf08fd26762d26a2bc9afa8fe8924a6344cff0b8b"

RPROVIDES:${PN} += "libLTO.so.20.1 \
libLTO20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
