SUMMARY = "Documentation for texlive-e-french"
DESCRIPTION = "This package includes the documentation for texlive-e-french"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.11svn52027"

RPM_NAME = "texlive-e-french-doc-2026.226.6.11svn52027-61.4.noarch.rpm"
RPM_HASH = "c48baa953c945955c3768753ddb798edc2e09017e0f8aaad25e8ff1eb41906609a83201181e29d44070b87ea73673b262a13c765214deb3719fed680a1cee6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-e-french-doc-en;fr \
texlive-e-french-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
