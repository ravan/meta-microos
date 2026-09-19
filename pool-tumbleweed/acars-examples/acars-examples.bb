SUMMARY = "Example applications for libacars"
DESCRIPTION = "Example applications for for libacars: \
 \
 * decode_arinc.c - decodes ARINC-622 messages supplied at the \
   command line or from a file. \
 * adsc_get_position - illustrates how to extract position-related \
   fields from decoded ADS-C message. \
 * cpdlc_get_position - illustrates how to extract position-related \
   fields from CPDLC position reports. \
 * media_advisory - decodes Media Advisory messages (ACARS label SA \
   reports)"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "acars-examples-1.3.1-1.27.aarch64.rpm"
RPM_HASH = "a1737a9116cfdf1caee37be2f5a62e85ed8b1ff349453d9cf860b792edb3c69df65385f3a145b2f8821ff0bd6c742498a107f404951ad0bd272a0551b7634d9e"

RPROVIDES:${PN} += "acars-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars.so.1 \
libc.so.6"

inherit rpm
