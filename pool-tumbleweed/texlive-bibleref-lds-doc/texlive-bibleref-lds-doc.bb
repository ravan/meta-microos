SUMMARY = "Documentation for texlive-bibleref-lds"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-lds"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-doc-2026.226.1.0svn25526-61.2.noarch.rpm"
RPM_HASH = "aacdccdc59b22bf8e0c1776a86721c780b2553da2b84a2e42d6580adb00f9fc4e7964445d8d1defd62c5bd037c84f650a73520993153a45190046d244c4bbac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-lds-doc"

RDEPENDS:${PN} += ""

inherit rpm
