SUMMARY = "Documentation for texlive-dviinfox"
DESCRIPTION = "This package includes the documentation for texlive-dviinfox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn59216"

RPM_NAME = "texlive-dviinfox-doc-2026.226.1.06svn59216-61.4.noarch.rpm"
RPM_HASH = "313876c631fc266c6cef4c1ced6b6b8d90a829ba3c0632b49b3ae7f2513e18f801b96775ca2badabc289c9a087971413fed11f456dc4e4e57658e6ec4db8e52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox-doc"

RDEPENDS:${PN} += ""

inherit rpm
