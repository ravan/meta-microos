SUMMARY = "DICOM medical file parser library"
DESCRIPTION = "This package contains the shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "libgdcm3_2-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "2ee4ec2bfc77508750a8432006821e138fa801350a9f688d5880625f76d5c9bf9120d17244da36b61234e94f848d13db258a006640e979c18f2e085355119543"

RPROVIDES:${PN} += "libgdcm3-2 \
libgdcmCommon.so.3.2 \
libgdcmDICT.so.3.2 \
libgdcmDSED.so.3.2 \
libgdcmIOD.so.3.2 \
libgdcmMEXD.so.3.2 \
libgdcmMSFF.so.3.2 \
libgdcmjpeg12.so.3.2 \
libgdcmjpeg16.so.3.2 \
libgdcmjpeg8.so.3.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcharls.so.2 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libsocketxx.so.1.2 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
