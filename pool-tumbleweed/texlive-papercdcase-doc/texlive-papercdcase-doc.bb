SUMMARY = "Documentation for texlive-papercdcase"
DESCRIPTION = "This package includes the documentation for texlive-papercdcase"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-papercdcase-doc-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "37a3235676d3f579c09bcab7296f08810346b25abc431ba2c8736b1f323bcc6635e3dc37045b97b26863bcc55683f24756e4b46fa0ce08cb724e018caddf39f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papercdcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
