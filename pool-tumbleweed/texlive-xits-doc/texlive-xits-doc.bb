SUMMARY = "Documentation for texlive-xits"
DESCRIPTION = "This package includes the documentation for texlive-xits"
LICENSE = "OFL-1.1"

PV = "2026.226.1.302svn55730"

RPM_NAME = "texlive-xits-doc-2026.226.1.302svn55730-59.4.noarch.rpm"
RPM_HASH = "e66ade58373e6ca4b9d1767bb6c63f77fefacde898473b7ae1db8b11c5cfb2c184a8b0efd1f62f4dfeff779f88a61a726c29448771665c639551be8f193ec581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits-doc"

RDEPENDS:${PN} += ""

inherit rpm
