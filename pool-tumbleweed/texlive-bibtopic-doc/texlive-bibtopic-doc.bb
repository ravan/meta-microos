SUMMARY = "Documentation for texlive-bibtopic"
DESCRIPTION = "This package includes the documentation for texlive-bibtopic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-bibtopic-doc-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "051f08218c04f22fbf0cd86061cac1abaa654bd355f03c686051f061573986dd1835bcf494346e08a0491801fd0f8575a6854cf85bad40b0baab33780214f649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopic-doc"

RDEPENDS:${PN} += ""

inherit rpm
