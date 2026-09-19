SUMMARY = "Documentation for texlive-xcpdftips"
DESCRIPTION = "This package includes the documentation for texlive-xcpdftips"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-doc-2026.226.1.1svn50449-59.4.noarch.rpm"
RPM_HASH = "59297cdbac97cc7ddae8251ed6cf78af87330ffd608ae702ce02f4d00b7883c98dc495b7222a67923cf24e006bbdcf6915f40b8383b29f77a56e69bf2333ec49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcpdftips-doc"

RDEPENDS:${PN} += ""

inherit rpm
