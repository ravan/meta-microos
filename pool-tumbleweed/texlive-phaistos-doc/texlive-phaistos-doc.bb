SUMMARY = "Documentation for texlive-phaistos"
DESCRIPTION = "This package includes the documentation for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18651"

RPM_NAME = "texlive-phaistos-doc-2026.226.1.0svn18651-58.2.noarch.rpm"
RPM_HASH = "a9f7f6d1fc10d68b96883d27bd03bebdffbc309d011d55cf792779204087a88b6a8d49a0a28a2881cb8e49f9f981ec1515824ccd641b1e838b0f5c63aa235114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phaistos-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
