SUMMARY = "Documentation for texlive-xint-regression"
DESCRIPTION = "This package includes the documentation for texlive-xint-regression"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn77909"

RPM_NAME = "texlive-xint-regression-doc-2026.226.0.0.1.3svn77909-59.4.noarch.rpm"
RPM_HASH = "74a03b6412e35d35a682020c969a69efe0128760e800e8146226fe335556350d4e54f6b4a57a73e6815b291f0cbc7eadfd973f96cdfd2920c7c0d450ea1d4226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-regression-doc"

RDEPENDS:${PN} += ""

inherit rpm
