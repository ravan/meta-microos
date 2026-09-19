SUMMARY = "Documentation for texlive-askmaps"
DESCRIPTION = "This package includes the documentation for texlive-askmaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-doc-2026.226.0.0.2svn56730-60.2.noarch.rpm"
RPM_HASH = "f9ad3c419f4eeaaa76b0fb8c22e89463f8a11ba2fa1b81c933d4dde930a116a45ad8e77717090a40e9d16f5af47c0acba2423639968a9ff2aeb60d4bd13feec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
