SUMMARY = "Development files for link-grammar, an English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology. \
 \
This package contains the development files for development with \
Link Grammar."
LICENSE = "LGPL-2.1-only"

PV = "5.12.5"

RPM_NAME = "link-grammar-devel-5.12.5-1.6.aarch64.rpm"
RPM_HASH = "8eb3092f5232d5ffea9021e9bdb57010d5673e95ef8d17398af864648681f642b143ea591ae1ba2376cf36d6cccb9a4349a299ea413ac0f9451c443499cd6208"

RPROVIDES:${PN} += "link-grammar-devel \
pkgconfig-link-grammar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblink-grammar5"

inherit rpm
