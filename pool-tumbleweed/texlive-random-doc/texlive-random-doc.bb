SUMMARY = "Documentation for texlive-random"
DESCRIPTION = "This package includes the documentation for texlive-random"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn54723"

RPM_NAME = "texlive-random-doc-2026.226.0.0.2svn54723-60.4.noarch.rpm"
RPM_HASH = "91f5efa692587ddbd216bb15530b05df1a4091b208d83446bc1e10df5bb37dffa4506fcf3e92060774b83ed4d82219cc9af6fc73f3345786379a774d1f07e7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-random-doc"

RDEPENDS:${PN} += ""

inherit rpm
