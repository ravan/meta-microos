SUMMARY = "Documentation for texlive-dblfloatfix"
DESCRIPTION = "This package includes the documentation for texlive-dblfloatfix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-dblfloatfix-doc-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "82f1f58feba2cd3f0e26e042063aa8daa6c7568b12e79356f4ee2f09e1a9dc98ca4fa7a464a3ae3ae87543b2e2c191f8b2d400eb420a941921bb310e1d6a8e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dblfloatfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
