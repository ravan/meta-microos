SUMMARY = "OpenCASCADE foundation classes libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE foundation classes module: \
  TKernel TKMath"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-foundationclasses7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "a34befb9a92ed61669f6a8e7f2ccf34ae9140ca5f5f888bcee22ee1ea97b53a9653dd7edfccaa0dcbe7c4013ace69d9932d6839a578f08c273dbe78863419fbb"

RPROVIDES:${PN} += "libTKMath.so.7.9.3 \
libTKernel.so.7.9.3 \
libopencascade-foundationclasses7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
