SUMMARY = "OpenJDK 8 Demos"
DESCRIPTION = "The OpenJDK 8 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openj9-demo-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "c2886994e05d49ad38a5d49f1fad415e63bc3d93713926f1515365e1915e4d0b04502fab7c189d0dd36953578f24db71c2ce37b0a6142b3838efb54320cf540b"

RPROVIDES:${PN} += "java-1-8-0-openj9-demo \
libcompiledMethodLoad.so \
libgctest.so \
libheapTracker.so \
libheapViewer.so \
libhprof.so \
libminst.so \
libmtrace.so \
libversionCheck.so \
libwaiters.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
