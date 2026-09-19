SUMMARY = "Documentation for texlive-dtxdescribe"
DESCRIPTION = "This package includes the documentation for texlive-dtxdescribe"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.09svn69507"

RPM_NAME = "texlive-dtxdescribe-doc-2026.226.1.09svn69507-59.2.noarch.rpm"
RPM_HASH = "a0f50d0dae15d62d63869624fec8614404e3ebe5b6fa49e2c5e8ee6d3f41520e7a4478710ea8f4bd5e7fd269d1bf0b5321142d1eda1bc6c46d27f673cc4fc707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxdescribe-doc"

RDEPENDS:${PN} += ""

inherit rpm
