SUMMARY = "Tone Mapping Operators for High Dynamic Range Images"
DESCRIPTION = "pfstmo package contains the implementation of tone mapping operators, \
suitable for processing of both static images and animations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstmo-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "a0bfda5108f0c7ce9946045317ceccd3803fe7e6e3817635cafcbfa52f5148c6158c80a0c84b67903c0dda299e5e1163d7fa5aba3d52ab112c12643d391cdbfe"

RPROVIDES:${PN} += "pfstmo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
