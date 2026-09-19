SUMMARY = "Documentation for texlive-droid"
DESCRIPTION = "This package includes the documentation for texlive-droid"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-droid-doc-2026.226.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "5b9a7d2f7262dc76fd621c5b12a27ad0f36c2e7a5f68bb74bda63f7eba5a686f0aec96947e1cf95a2adac4625cd9a48fa32dfb30e37be6fcb4e162c4fbeb33c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-droid-doc"

RDEPENDS:${PN} += ""

inherit rpm
