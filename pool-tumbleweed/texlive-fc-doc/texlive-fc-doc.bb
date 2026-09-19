SUMMARY = "Documentation for texlive-fc"
DESCRIPTION = "This package includes the documentation for texlive-fc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn32796"

RPM_NAME = "texlive-fc-doc-2026.226.1.4svn32796-59.2.noarch.rpm"
RPM_HASH = "7183d2133a330973056a05f51a009f439fc8904a8c6811b8f627816fc73cc89da29cac2d6342f35abc05596ff4c1a1834f75f5d8c300f6afe39a92e288ec63aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fc-doc"

RDEPENDS:${PN} += ""

inherit rpm
