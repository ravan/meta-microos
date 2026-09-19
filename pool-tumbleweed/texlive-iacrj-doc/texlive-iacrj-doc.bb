SUMMARY = "Documentation for texlive-iacrj"
DESCRIPTION = "This package includes the documentation for texlive-iacrj"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77813"

RPM_NAME = "texlive-iacrj-doc-2026.226.0.0.9.1svn77813-60.2.noarch.rpm"
RPM_HASH = "51990c659c1e9af5fe2c5f31f431e44eb76c306c50973367f8b66abebfc883fe3ced764059e7e7795e6db7d9ebe36eaeaa2503ef29521fb48e171e935938aefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iacrj-doc"

RDEPENDS:${PN} += ""

inherit rpm
