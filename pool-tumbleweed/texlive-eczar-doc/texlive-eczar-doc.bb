SUMMARY = "Documentation for texlive-eczar"
DESCRIPTION = "This package includes the documentation for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn57716"

RPM_NAME = "texlive-eczar-doc-2026.226.0.0.1svn57716-61.4.noarch.rpm"
RPM_HASH = "d47c88c373c48436a48825acada6329bffc5e4fc869b81bb3a453ef024b808a80d507ec2bc8b3a94f54547bf81ee39282dcf758adcf33b1d0510597e4571ff23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar-doc"

RDEPENDS:${PN} += ""

inherit rpm
