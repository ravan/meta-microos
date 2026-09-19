SUMMARY = "Documentation for texlive-ucs"
DESCRIPTION = "This package includes the documentation for texlive-ucs"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn78101"

RPM_NAME = "texlive-ucs-doc-2026.226.2.4svn78101-60.2.noarch.rpm"
RPM_HASH = "b68e04b716fd7b8c57382a364cc168793ef3ecd115c69d8bdecc25ce791a2cf2c98e3f1b7ff94f1180dd1d4773607949b87b04dab471f51c9bc5053fcbbe71c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucs-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
