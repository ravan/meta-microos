SUMMARY = "Subdivision surface evaluation library"
DESCRIPTION = "OpenSubdiv is a set of libraries that implement subdivision surface \
(subdiv) evaluation on massively parallel CPU and GPU architectures. \
This code path is optimized for drawing deforming surfaces with \
static topology at interactive framerates. \
 \
OpenSubdiv is an API for use by 3rd party digital content creation \
tools. It is not an application, nor a tool that can be used directly \
to create digital assets."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "libosdCPU3_6_1-3.6.1-1.6.aarch64.rpm"
RPM_HASH = "789236ede0bb96e534d359ba23166ad1286bfc7a1ce95e23b9c8c19af4c5ac80cff57ecad1157fdf45b0f0066aa7c841766471b6df6efd462d7301b0dbf889e1"

RPROVIDES:${PN} += "libosdCPU.so.3.6.1 \
libosdCPU3-6-1 \
libosdGPU.so.3.6.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
