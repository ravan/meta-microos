SUMMARY = "Documentation for texlive-gudea"
DESCRIPTION = "This package includes the documentation for texlive-gudea"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-doc-2026.226.0.0.0.1svn57359-60.4.noarch.rpm"
RPM_HASH = "70e25e47f6faf308f4ec601bac10dca14ce382999879d1c8cd0a117c18d83842dd43ea76d69a4dee18e82bc5dff73b4ec2f95d99488063a9439d6f4c9db90ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gudea-doc"

RDEPENDS:${PN} += ""

inherit rpm
