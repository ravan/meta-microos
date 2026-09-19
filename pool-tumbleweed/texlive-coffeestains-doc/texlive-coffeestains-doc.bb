SUMMARY = "Documentation for texlive-coffeestains"
DESCRIPTION = "This package includes the documentation for texlive-coffeestains"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-doc-2026.226.0.0.5.1svn59703-60.2.noarch.rpm"
RPM_HASH = "359c353c0ba0c2d78d4844ee57dffda91b186730147c598c62084bd67f6a9db879d7bc9167684360f340ea40101d16a88b13a7bc5d78b623e4b8ad2fa45214d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-coffeestains-doc-fr \
texlive-coffeestains-doc"

RDEPENDS:${PN} += ""

inherit rpm
