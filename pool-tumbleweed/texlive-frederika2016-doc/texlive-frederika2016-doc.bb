SUMMARY = "Documentation for texlive-frederika2016"
DESCRIPTION = "This package includes the documentation for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2026.226.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-doc-2026.226.1.000_2016_initial_releasesvn42157-60.2.noarch.rpm"
RPM_HASH = "1efac2fd1ea97cf603ccc117b41d27f91a6fd309108c74d968217aabf1e832701f0c75f686243ff26d580897b93c27f3a90610a42c82e25dd0d9119aec39c527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016-doc"

RDEPENDS:${PN} += ""

inherit rpm
