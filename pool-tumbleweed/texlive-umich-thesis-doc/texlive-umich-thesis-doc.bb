SUMMARY = "Documentation for texlive-umich-thesis"
DESCRIPTION = "This package includes the documentation for texlive-umich-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-doc-2026.226.1.20svn15878-60.2.noarch.rpm"
RPM_HASH = "b85c21ea392b3a2361b64d81d6a2c247c42558d8ae94fbd87b6952191cbff457c6fae793ea307dfed22ec7e9cdf5aa9e5a5c7d72d003a425e2de3245cbfacc19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umich-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
