SUMMARY = "Documentation for texlive-obnov"
DESCRIPTION = "This package includes the documentation for texlive-obnov"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn33355"

RPM_NAME = "texlive-obnov-doc-2026.226.0.0.11svn33355-61.2.noarch.rpm"
RPM_HASH = "ee45f8456bf60170ca8cf0db1a672ae4d292b35ea2b33f59c83b97c876373985f76be5666cdb2ad207e0fe960587c28578318263a14924c3ac981cb89000e3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-obnov-doc"

RDEPENDS:${PN} += ""

inherit rpm
