SUMMARY = "Handling of digital vaccination, test and recovery certificates"
DESCRIPTION = "KHeathCertificate permits parsing of digital vaccination, test and recovery \
certificates. \
The following certificate formats can be parsed: \
- Digital Infrastructure for Vaccination Open Credentialing (DIVOC), the \
system used for Indian vaccination certificates. \
- EU 'Digital Green Certificate' (DCG) vaccination, test and recovery \
certificates \
- SMART Heath Cards (SHC) vaccination certificates, in use some areas of North \
America. \
Check the README.md file for formats with limited support."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khealthcertificate-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "09d1a494987884cb5b4838dd89b3be848be401d0426ce3e726183127bd1cca75b0df4a0d8aea5ce94e6b0d6c507174ebc89de1adeef2c2b96af6a71231187e1a"

RPROVIDES:${PN} += "khealthcertificate"

RDEPENDS:${PN} += ""

inherit rpm
