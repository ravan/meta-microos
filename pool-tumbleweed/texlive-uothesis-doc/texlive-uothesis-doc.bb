SUMMARY = "Documentation for texlive-uothesis"
DESCRIPTION = "This package includes the documentation for texlive-uothesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-doc-2026.226.2.5.6svn25355-60.2.noarch.rpm"
RPM_HASH = "bc4d4238e5347afda429166fdaec8abcbf678c9b7b09cb0d90dff1947b287771cf1c7c63709dcfad261efdb354a971077ea97ce82cebe5de1b1790304fa967fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uothesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
