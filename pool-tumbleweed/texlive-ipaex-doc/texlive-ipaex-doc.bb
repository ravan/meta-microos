SUMMARY = "Documentation for texlive-ipaex"
DESCRIPTION = "This package includes the documentation for texlive-ipaex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-ipaex-doc-2026.226.svn61719-63.2.noarch.rpm"
RPM_HASH = "4f7348483a2544e44c6d4ac86b35a2ed024a4e459752af78ab957ce2a9da2925e731871f0c3e5323f38e8643d6a7eb3dac2112da768c9dea8ff53a8100129bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex-doc"

RDEPENDS:${PN} += ""

inherit rpm
