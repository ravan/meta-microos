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

PV = "2.2.1"

RPM_NAME = "acars2-examples-2.2.1-1.4.aarch64.rpm"
RPM_HASH = "42ed3792d387ba9a2f79970972801a0748cd119043d5051b5a3c955beb0774b30ca0790c2c7a18610b40959f8e10bc658c752a77d832e925a4bce9df84dad3e1"

RPROVIDES:${PN} += "acars2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars-2.so.2 \
libc.so.6"

inherit rpm
