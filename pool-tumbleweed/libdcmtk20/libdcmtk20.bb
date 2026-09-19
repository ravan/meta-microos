SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "3.7.0"

RPM_NAME = "libdcmtk20-3.7.0-2.4.aarch64.rpm"
RPM_HASH = "d7186dd1ef0f19f2d06340e6483aac57c2c5341d1bf87971c516b35df286f1d8893c19854676a6e852e4049fe5e4e0b88a3ae5e6a3f42576a198685ffe19bbba"

RPROVIDES:${PN} += "libcmr.so.20 \
libdcmdata.so.20 \
libdcmdsig.so.20 \
libdcmect.so.20 \
libdcmfg.so.20 \
libdcmimage.so.20 \
libdcmimgle.so.20 \
libdcmiod.so.20 \
libdcmjpeg.so.20 \
libdcmjpls.so.20 \
libdcmnet.so.20 \
libdcmpmap.so.20 \
libdcmpstat.so.20 \
libdcmqrdb.so.20 \
libdcmrt.so.20 \
libdcmseg.so.20 \
libdcmsr.so.20 \
libdcmtk20 \
libdcmtkcharls.so.20 \
libdcmtls.so.20 \
libdcmtract.so.20 \
libdcmwlm.so.20 \
libdcmxml.so.20 \
libi2d.so.20 \
libijg12.so.20 \
libijg16.so.20 \
libijg8.so.20 \
liboficonv.so.20 \
liboflog.so.20 \
libofstd.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libwrap.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
