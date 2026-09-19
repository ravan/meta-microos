SUMMARY = "Documentation for texlive-a5comb"
DESCRIPTION = "This package includes the documentation for texlive-a5comb"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4svn76924"

RPM_NAME = "texlive-a5comb-doc-2026.226.4svn76924-61.2.noarch.rpm"
RPM_HASH = "da16e2e4e8f3cd450f512b13bbab9b299adb34f490e47edce0a2e6cb0ea2d816fe48858dc37713865fd8f0cabfd26c7fb079b0a2b6b5283fc48aeed24dc7c036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a5comb-doc"

RDEPENDS:${PN} += ""

inherit rpm
