SUMMARY = "SoapySDR LMS7 support module"
DESCRIPTION = "Soapy LMS7 - LimeSDR device support for Soapy SDR. \
A Soapy module that supports LimeSDR devices within the Soapy API."
LICENSE = "Apache-2.0"

PV = "23.11.0"

RPM_NAME = "soapysdr0.8-3-module-lms7-23.11.0-4.1.aarch64.rpm"
RPM_HASH = "8975f2ec7fcfa015211b87d6670ade3564a5844fce21c3cda9e0846913fd8ddf11ff7d9af6224d779c4d66018bdb8f0bf2b57e3e5bee1d4340337a230cedea09"

RPROVIDES:${PN} += "libLMS7Support.so \
soapysdr0.8-3-module-lms7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLimeSuite.so.23.11-1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
