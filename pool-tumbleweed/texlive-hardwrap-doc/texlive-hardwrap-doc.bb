SUMMARY = "Documentation for texlive-hardwrap"
DESCRIPTION = "This package includes the documentation for texlive-hardwrap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-hardwrap-doc-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "4551818efd384f351b09982e8e1da87aac4cec5d2e92611b2c9560919625d710f93efa087579e12d4191c65dd37fc3dc45c4b243fdbdb5ea6b71430208b29fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hardwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
