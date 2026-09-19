SUMMARY = "Command line programs for GDCM"
DESCRIPTION = "This package includes tools to convert, anonymize, manipulate, \
concatenate, and view DICOM files."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "gdcm-applications-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "442793e788ab36ac0ca00146d36d5e96f390cff978c5dcc29056d03b1c549ca3abe3ff56b6a6c10d210735e6cf00255e91b2ff380ebe405fe208da5da53ce771"

RPROVIDES:${PN} += "gdcm-applications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdcmCommon.so.3.2 \
libgdcmDICT.so.3.2 \
libgdcmDSED.so.3.2 \
libgdcmIOD.so.3.2 \
libgdcmMEXD.so.3.2 \
libgdcmMSFF.so.3.2 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
