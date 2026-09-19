SUMMARY = "ImageMagick file import for PFS tools"
DESCRIPTION = "This package contains input and output filters for ImageMagick to \
support pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-imgmagick-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "9b2e0fe843df1772a20e7a0de48bac838c3ce8716fc332a4d527bce2f45ab5b274c0ea4e356ce74d279237ef9a0f7c40d26e0dde20dc679a57143d6bd1fcd035"

RPROVIDES:${PN} += "pfstools-imgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
