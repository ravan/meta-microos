SUMMARY = "Documentation for texlive-genealogy"
DESCRIPTION = "This package includes the documentation for texlive-genealogy"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25112"

RPM_NAME = "texlive-genealogy-doc-2026.226.svn25112-60.2.noarch.rpm"
RPM_HASH = "2b75c6c936e4592dfcb55eadf2e2bc105bb2948dd09b4ad431019e31325d1167038f2569899310da3106ae736264ebeaa133337e8011e5a27f5c02b4a80891ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogy-doc"

RDEPENDS:${PN} += ""

inherit rpm
