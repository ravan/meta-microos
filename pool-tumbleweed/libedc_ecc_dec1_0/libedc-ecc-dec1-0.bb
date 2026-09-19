SUMMARY = "Reed-Solomon decoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon decoder for Compact Discs with \
a mechanism for Error Detection and Correction (EDC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc_dec1_0-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "0b0e9e7dab31ac97470bc38d8edcf28fe42672637dad67c82a9f029fef135239810f84d5dfc59cde37ff9ab73718c448d8e4b6a09acd91676156f695b6535957"

RPROVIDES:${PN} += "libedc-ecc-dec.so.1.0 \
libedc-ecc-dec1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedc-ecc.so.1.0"

inherit rpm
