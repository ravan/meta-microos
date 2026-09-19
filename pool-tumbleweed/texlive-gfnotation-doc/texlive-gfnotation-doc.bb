SUMMARY = "Documentation for texlive-gfnotation"
DESCRIPTION = "This package includes the documentation for texlive-gfnotation"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.9svn37156"

RPM_NAME = "texlive-gfnotation-doc-2026.226.2.9svn37156-60.2.noarch.rpm"
RPM_HASH = "b577b139dd1aa6ac97710deb899daeef76909ea1ffe0ce177675cfa82d0805055d98fa2bc14e3e293efd1a9404b114871bd49844aea31ba53972922e8edd69c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfnotation-doc"

RDEPENDS:${PN} += ""

inherit rpm
