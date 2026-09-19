SUMMARY = "Documentation for texlive-xcite"
DESCRIPTION = "This package includes the documentation for texlive-xcite"
LICENSE = "LPPL-1.0"

PV = "2026.226.16383.99998svn77682"

RPM_NAME = "texlive-xcite-doc-2026.226.16383.99998svn77682-59.4.noarch.rpm"
RPM_HASH = "4850864410e3defc16cdebc4acd7f2c24804c07ccad186c064ac6c0c8f449f8a47b1e8af85b010cf44d6c7ddbb0fef674e14dfa206e9019590d8dd08897c1776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
