SUMMARY = "Documentation for texlive-copyedit"
DESCRIPTION = "This package includes the documentation for texlive-copyedit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn37928"

RPM_NAME = "texlive-copyedit-doc-2026.226.1.6svn37928-61.2.noarch.rpm"
RPM_HASH = "b81dd895e92e5c81da129638c329d0c9827ae755ab289d40b334fabd5ab2144d6eb2a3d6da725416d9eadbd9532b94f05d36129cbadfc7c8853f162591e93a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyedit-doc"

RDEPENDS:${PN} += ""

inherit rpm
