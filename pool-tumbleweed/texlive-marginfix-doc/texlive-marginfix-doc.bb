SUMMARY = "Documentation for texlive-marginfix"
DESCRIPTION = "This package includes the documentation for texlive-marginfix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-marginfix-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "30d7d3f9a0fa735048564f561b129f1a40078039710587039741426effe7ccec7a57d4ff3c2381530bafa9fe6894ae5e86a10019e906081878f49c19255a6f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
