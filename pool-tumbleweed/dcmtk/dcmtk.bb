SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "3.7.0"

RPM_NAME = "dcmtk-3.7.0-2.4.aarch64.rpm"
RPM_HASH = "497097f22bfdc6d1c6e423b1afd148039503fb0553c75cb6aa185d6c37bf2749ee89beeda65191cf7290dd4108be976eb4fabc5d81a504481a4fc4dc434387a4"

RPROVIDES:${PN} += "config-dcmtk \
dcmtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdcmdata.so.20 \
libdcmdsig.so.20 \
libdcmimage.so.20 \
libdcmimgle.so.20 \
libdcmjpeg.so.20 \
libdcmjpls.so.20 \
libdcmnet.so.20 \
libdcmpstat.so.20 \
libdcmqrdb.so.20 \
libdcmrt.so.20 \
libdcmsr.so.20 \
libdcmtls.so.20 \
libdcmwlm.so.20 \
libdcmxml.so.20 \
libgcc-s.so.1 \
libi2d.so.20 \
libm.so.6 \
liboficonv.so.20 \
liboflog.so.20 \
libofstd.so.20 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
