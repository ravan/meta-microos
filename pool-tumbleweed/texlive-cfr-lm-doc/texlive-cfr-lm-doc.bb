SUMMARY = "Documentation for texlive-cfr-lm"
DESCRIPTION = "This package includes the documentation for texlive-cfr-lm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-cfr-lm-doc-2026.226.1.9svn77682-59.2.noarch.rpm"
RPM_HASH = "7b9f52d375f9cfda3636a3e9f06c5431ff119e3a86fce49f87a6eecd00bb05610e190dcdce2a2d53f0326af281d60e62e7c5f0e87e682e0a1b542b68b71ed2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-lm-doc"

RDEPENDS:${PN} += ""

inherit rpm
