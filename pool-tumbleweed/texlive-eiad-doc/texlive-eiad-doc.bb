SUMMARY = "Documentation for texlive-eiad"
DESCRIPTION = "This package includes the documentation for texlive-eiad"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-eiad-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "22b36f32f8fdb665a4c9c8e5037cddb03f23b9bae2d30e44c5b21135aa964ad1938beef8cddfd1232afa42ec6aeae6ff3bb2a7d38367a81100ced848e7d45324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-doc"

RDEPENDS:${PN} += ""

inherit rpm
