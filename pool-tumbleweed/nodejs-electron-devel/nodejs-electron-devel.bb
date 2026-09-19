SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Source-Code & bzip2-1.0.6 & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "37.10.2"

RPM_NAME = "nodejs-electron-devel-37.10.2-3.7.aarch64.rpm"
RPM_HASH = "fe1736fefaf302256609f8ce78a56f4860d85f2726e70eaff747c500814575e9f348213d476ff73745b57bb0c882bd0c97662b094653fd1cb406a12612efc3cc"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-check-native \
rpm-macro-electron-check-native-unstable \
rpm-macro-electron-rebuild \
rpm-macro-electron-req"

RDEPENDS:${PN} += "/usr/bin/sh \
nodejs-electron \
npm24 \
pkgconfig-zlib"

inherit rpm
