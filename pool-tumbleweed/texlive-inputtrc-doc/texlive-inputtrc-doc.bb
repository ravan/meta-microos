SUMMARY = "Documentation for texlive-inputtrc"
DESCRIPTION = "This package includes the documentation for texlive-inputtrc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-doc-2026.226.0.0.3svn28019-60.2.noarch.rpm"
RPM_HASH = "dd91110b4d4c1036c7b11dd1e25686f235ff5ee8458d064a955bd5b0253fec9355c92e90b1fa4a654a043771f98cc9c0297c9758d79fd1b4931c218c16964509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputtrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
