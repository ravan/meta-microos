SUMMARY = "Documentation for texlive-morisawa"
DESCRIPTION = "This package includes the documentation for texlive-morisawa"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-morisawa-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "399121b312ae16db14a58f80ed5e1e0310c7ef07d2755b227bfd083ea60be5665f340f6a0927f2cf79153d300bb0ff2e198bcb7f5cb9208d1eee4203469b87a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-morisawa-doc-ja \
texlive-morisawa-doc"

RDEPENDS:${PN} += ""

inherit rpm
