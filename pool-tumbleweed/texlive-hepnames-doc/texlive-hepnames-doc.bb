SUMMARY = "Documentation for texlive-hepnames"
DESCRIPTION = "This package includes the documentation for texlive-hepnames"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-hepnames-doc-2026.226.2.0svn76924-60.4.noarch.rpm"
RPM_HASH = "c3a770832db3146c593da680f2aff94944c5b09247589419e5cf2968c373a4975b277677a6f1c7898942885497b3e450e04725ca9f53ef72128b0bfadc90ec16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepnames-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
