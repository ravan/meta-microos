SUMMARY = "Documentation for texlive-widows-and-orphans"
DESCRIPTION = "This package includes the documentation for texlive-widows-and-orphans"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0fsvn77682"

RPM_NAME = "texlive-widows-and-orphans-doc-2026.226.1.0fsvn77682-60.2.noarch.rpm"
RPM_HASH = "ca3407216f82f1698884f7e9d06b10fb6d5878a469c985796b6ab044040c50255def379edd64e58bf4031f1871c4c6dcc9f0b531537c886da804ca9d50f75586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widows-and-orphans-doc"

RDEPENDS:${PN} += ""

inherit rpm
