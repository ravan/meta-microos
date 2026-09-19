SUMMARY = "Command-line file archiver with high compression ratio"
DESCRIPTION = "This package contains the 7z command line utility for archiving and \
extracting various formats."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LicenseRef-SUSE-Public-Domain"

PV = "26.02"

RPM_NAME = "7zip-26.02-2.1.aarch64.rpm"
RPM_HASH = "5be58fb731d13580b8c5c9a29a42a9887b15ee112600a902b6194402a1764706af9fbb249cc6a90d44d7aa03bb74add3cd0584436209f9326e72318ced87de64"

RPROVIDES:${PN} += "7zip \
p7zip \
p7zip-full"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
