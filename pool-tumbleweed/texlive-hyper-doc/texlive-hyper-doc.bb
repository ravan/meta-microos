SUMMARY = "Documentation for texlive-hyper"
DESCRIPTION = "This package includes the documentation for texlive-hyper"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2dsvn17357"

RPM_NAME = "texlive-hyper-doc-2026.226.4.2dsvn17357-60.2.noarch.rpm"
RPM_HASH = "044c60d7f4f171ae323d1b7253ffce8dc63ba8b0ad50ec3361710e20c10cdc57ac0ce7865593a5690defd927a9adfe70307fd98f804f127f6ce3a318a6851f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
