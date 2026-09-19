SUMMARY = "Documentation for texlive-sunpath"
DESCRIPTION = "This package includes the documentation for texlive-sunpath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn72604"

RPM_NAME = "texlive-sunpath-doc-2026.226.0.0.5svn72604-64.2.noarch.rpm"
RPM_HASH = "5ac043d183a0181ca90508e09a9eaa5cc9e2e04d38ec2d6a23806f2266ee35c6da7edfd3d4b7a6c68cc17ac901a723cf60cf6c18ceb649998667272c3f3aa646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sunpath-doc"

RDEPENDS:${PN} += ""

inherit rpm
