SUMMARY = "A Library for embedding Mono in your Application (SGen GC)"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
A Library for embedding Mono in your application using the precise SGen \
garbage collector."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmonosgen-2_0-1-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "812697bd9333d781d8523f835e681057f5714ec7a8c043bf0e0c0b458acbde5cfda68e7b28f5a80fb2cf06d43027b023fe8e7387365806a3205ab060df57b5fb"

RPROVIDES:${PN} += "libmonosgen-2-0-1 \
libmonosgen-2.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
