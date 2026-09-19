SUMMARY = "Documentation for texlive-fbb"
DESCRIPTION = "This package includes the documentation for texlive-fbb"
LICENSE = "OFL-1.1"

PV = "2026.226.1.16svn77682"

RPM_NAME = "texlive-fbb-doc-2026.226.1.16svn77682-59.2.noarch.rpm"
RPM_HASH = "9d891ed879e7974e0da031e7edd1d7fed760302ac098c56a7cd81d9acfada1ee472444d0335d0afa2cb4254d0313228fa10ccf36fcd8502c2aa03f9cc1a5c67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
