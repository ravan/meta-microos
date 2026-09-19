SUMMARY = "Documentation for texlive-varisize"
DESCRIPTION = "This package includes the documentation for texlive-varisize"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-varisize-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "d702140ef3061a5f7d53d0668e226868d934a870c135bf893fce93aedf2eedea15949be9677bfec96d40800190a6a26815f83085e2338742f16daebffab6708e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varisize-doc"

RDEPENDS:${PN} += ""

inherit rpm
