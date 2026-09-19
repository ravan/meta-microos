SUMMARY = "Thread abstraction library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIlmThread"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "libIlmThread-3_4-33-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "5e46b4de6873cdea3a5b6ec87dbbd8ad275a6938f6928f9f26b71d36a41a74c59d6f13b075e3da3f83e1c7b06432e4bdd0902e77be9c2ccdffef8510f6a0fe41"

RPROVIDES:${PN} += "libIlmThread-3-4-33 \
libIlmThread-3-4.so.33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
