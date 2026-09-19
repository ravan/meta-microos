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

RPM_NAME = "libKHealthCertificate1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "551c9bd117dd75dafaef8d420003ad7484cd97ca65346c41c963d37d461ba33017ead06d3d4a4966c3eb21996dbbe403cf23fc18672580f72817f28f88ea09b7"

RPROVIDES:${PN} += "libKHealthCertificate.so.1 \
libKHealthCertificate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
khealthcertificate \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6I18nLocaleData.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
