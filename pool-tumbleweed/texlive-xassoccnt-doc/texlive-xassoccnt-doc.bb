SUMMARY = "Documentation for texlive-xassoccnt"
DESCRIPTION = "This package includes the documentation for texlive-xassoccnt"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-doc-2026.226.2.0svn61112-59.4.noarch.rpm"
RPM_HASH = "cba2b1ae68ba0d34d200f8488ec665a231c19e2867e18d7cbde7d6d9340034051e6a58a847b9ff08783c054d1df9cb8c98b13f3783c0fa50371664dc854f385d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xassoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
