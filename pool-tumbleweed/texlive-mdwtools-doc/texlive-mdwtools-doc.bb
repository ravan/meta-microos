SUMMARY = "Documentation for texlive-mdwtools"
DESCRIPTION = "This package includes the documentation for texlive-mdwtools"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-doc-2026.226.1.05.4svn15878-59.2.noarch.rpm"
RPM_HASH = "9dc883190dd2c3591494b67eac4d84d2322a42f3c14d3a309d01b8d388fe17f856e261a3edfdd6b1d83564e7921181ceb517574269eb96005cfdc975bfc85dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdwtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
