SUMMARY = "Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98."
LICENSE = "BSD-3-Clause"

PV = "2.7.2.2"

RPM_NAME = "mcpp-2.7.2.2-1.4.aarch64.rpm"
RPM_HASH = "159d81c7f3944c22ea345c1d9abd92831b6c8eb6b5d693eadb800cddc4a7a4ebe6ff95a1287328da68ff69673ec2de7f09861129482661f909299a1710d6de0d"

RPROVIDES:${PN} += "mcpp"

RDEPENDS:${PN} += "libc.so.6 \
libmcpp.so.0"

inherit rpm
