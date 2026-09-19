SUMMARY = "Documentation for texlive-notoccite"
DESCRIPTION = "This package includes the documentation for texlive-notoccite"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-notoccite-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "df7369c4a772799dbb45636c64312ef5533abacf34eaca20e6524ef6e66ff44f5bb5a8891f2767db9fbdfc74b3f4c28779f0981dafc087a29bc4c71f53b0ad4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notoccite-doc"

RDEPENDS:${PN} += ""

inherit rpm
