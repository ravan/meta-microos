SUMMARY = "Documentation for texlive-roboto"
DESCRIPTION = "This package includes the documentation for texlive-roboto"
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-roboto-doc-2026.226.svn77682-60.4.noarch.rpm"
RPM_HASH = "6ab4dab0b2323b719bad88de3ac5459b9c1b4cfe0a2c9a48689ec4ec5f442e76e3efd1d6de350f5325ce03aeb9111286822bcaad31b3582d06e667d5ac9c8575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roboto-doc"

RDEPENDS:${PN} += ""

inherit rpm
