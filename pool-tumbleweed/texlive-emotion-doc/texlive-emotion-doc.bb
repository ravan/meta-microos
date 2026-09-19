SUMMARY = "Documentation for texlive-emotion"
DESCRIPTION = "This package includes the documentation for texlive-emotion"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-emotion-doc-2026.226.0.0.2svn76924-61.4.noarch.rpm"
RPM_HASH = "325dafbc57904936f6ae4521a6e14c0e785381212ec2f9ef59ccfbfb1c3559e9d4cffe422356cf87f3b708e834b2bed705b1059b6d5015da976ef319b11a8a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emotion-doc"

RDEPENDS:${PN} += ""

inherit rpm
