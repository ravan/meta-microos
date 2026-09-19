SUMMARY = "Documentation for texlive-opensans"
DESCRIPTION = "This package includes the documentation for texlive-opensans"
LICENSE = "Apache-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-opensans-doc-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "24338bd2349423123a4d4e54bd6c7dac8c4cf5e2592d62af88b1cf4421ab895e2ef71ece360ee5e36c082b951c88e19be32a37e3bf74bf307d1cc43c1770a7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opensans-doc"

RDEPENDS:${PN} += ""

inherit rpm
