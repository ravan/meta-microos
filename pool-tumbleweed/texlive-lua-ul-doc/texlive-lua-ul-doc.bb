SUMMARY = "Documentation for texlive-lua-ul"
DESCRIPTION = "This package includes the documentation for texlive-lua-ul"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn77682"

RPM_NAME = "texlive-lua-ul-doc-2026.226.0.0.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "a67fbf0035bcae0454738c9839a88929da0995cd58ab69803b248e58767d8aefff562460b93d1b3c65f94a158f3a1bf6c051c09c3db284ae95eee2f9c0095a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
