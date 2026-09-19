SUMMARY = "Documentation for texlive-esvect"
DESCRIPTION = "This package includes the documentation for texlive-esvect"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-esvect-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "0be5be74c03b1f25107d1768a03c46ba0af299ba5e9352449354016a09b82132397a7f4ac34abb71a52fdf039d8b5290b6024d7422c1b6c2ce8b76fabd12ff9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esvect-doc"

RDEPENDS:${PN} += ""

inherit rpm
