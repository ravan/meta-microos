SUMMARY = "Documentation for texlive-tex-ps"
DESCRIPTION = "This package includes the documentation for texlive-tex-ps"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-tex-ps-doc-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "9066fca06da2072b365d43e2090b00116b49e4b647975cd1e13149a0b2c2c805ce2342374df157e095fff6f9fe8011847923de264d865daed65bfaff07bb3e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ps-doc"

RDEPENDS:${PN} += ""

inherit rpm
