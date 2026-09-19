SUMMARY = "Development files for openhtj2k"
DESCRIPTION = "This package contains openhtj2k, an implementation of ITU-T Rec.814 | ISO 15444-15 (a.k.a. HTJ2K)."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "openhtj2k-devel-0.19.0-1.3.aarch64.rpm"
RPM_HASH = "d235f31853212b526a302e63e60cc3ee1509733e56618c1e080069d814d31dd3a653afcc77765c406925808502f5114dc348f30f169cac62d44d90c5ac1f916e"

RPROVIDES:${PN} += "openhtj2k-devel \
pkgconfig-open-htj2k"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenhtj2k0 \
pkgconfig-libtiff-4"

inherit rpm
