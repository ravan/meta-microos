SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data. \
 \
This package contains the needed files to compile and link against the \
libksba."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.8.1"

RPM_NAME = "libksba-devel-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "0e3a0f6bf380d9d5f4ea76e2bcf38906925891bcbe7757646eead5e0d4e7636954a6a40a37c35a52e35ef3f69c25e2245215dbb1d48169d8bccc1c7c62b36fe1"

RPROVIDES:${PN} += "libksba-/usr/include/ksba.h \
libksba-devel \
pkgconfig-ksba"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libksba8 \
pkgconfig-gpg-error"

inherit rpm
