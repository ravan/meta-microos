SUMMARY = "Development files for gpgmepp"
DESCRIPTION = "GPGME++ is a C++ wrapper (or C++ bindings) for the GnuPG project's GPGME \
(GnuPG Made Easy) library, version 0.4.4 and later. \
 \
This package contains the files neede for building with gpgmepp."
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "gpgmepp-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "222c5d8587cd6b697d3f236680e0112f9fd2b5476b7bb6da7b4560196d76942fb70390c9db5af59b46d112a5702a4810440788f639f05c4371c93606bfc1280e"

RPROVIDES:${PN} += "cmake-Gpgmepp \
gpgmepp-devel \
libgpgmepp-devel \
pkgconfig-gpgmepp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpgmepp7 \
pkgconfig-gpg-error \
pkgconfig-gpgme"

inherit rpm
