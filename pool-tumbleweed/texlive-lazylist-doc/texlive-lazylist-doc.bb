SUMMARY = "Documentation for texlive-lazylist"
DESCRIPTION = "This package includes the documentation for texlive-lazylist"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn17691"

RPM_NAME = "texlive-lazylist-doc-2026.226.1.0asvn17691-61.2.noarch.rpm"
RPM_HASH = "4d1ad810dc1d87c086997e81a806b75c606419edd05852631f23946198068c547180f0e64c5ef9978b368ccd118d178056bc15db4061d442fd7dbb3526a793d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lazylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
