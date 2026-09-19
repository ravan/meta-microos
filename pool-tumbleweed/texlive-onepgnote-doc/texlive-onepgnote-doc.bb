SUMMARY = "Documentation for texlive-onepgnote"
DESCRIPTION = "This package includes the documentation for texlive-onepgnote"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.0svn75332"

RPM_NAME = "texlive-onepgnote-doc-2026.226.1.0.0svn75332-61.2.noarch.rpm"
RPM_HASH = "4f29f85a93e2add9ea0a8ea99e7472b860d0e4546e9223de4fbf8d7739b883af83cc4021002c10e7429bc3183ade23237deb52ca0d854f17644354617997461a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onepgnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
