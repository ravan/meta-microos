SUMMARY = "An eucJP-open mapping"
DESCRIPTION = "This module provides eucJP-ascii, one of eucJP-open mappings, and its \
derivative. Following encodings are supported. \
 \
  Canonical    Alias                           Description \
  -------------------------------------------------------------- \
  eucJP-ascii                                  eucJP-ascii \
               qr/\\beuc-?jp(-?open)?(-?19970715)?-?ascii$/i \
  x-iso2022jp-ascii                            7-bit counterpart \
               qr/\\b(x-)?iso-?2022-?jp-?ascii$/i \
  -------------------------------------------------------------- \
 \
*Note*: 'x-iso2022jp-ascii' is unofficial encoding name: It had never been \
registered by any standards bodies."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Encode-EUCJPASCII-0.03-5.54.aarch64.rpm"
RPM_HASH = "1182546672064217d338797a8e0b0f911cbe5a9fde7f164e46df62c365e3171858753c761e5cdc4bf534d3cc24f435cee6babc374ff31ad5a0f9ff606c28dad9"

RPROVIDES:${PN} += "perl-Encode--EUCJPASCII \
perl-Encode-EUCJPASCII"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
