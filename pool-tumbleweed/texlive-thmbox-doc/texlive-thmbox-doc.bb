SUMMARY = "Documentation for texlive-thmbox"
DESCRIPTION = "This package includes the documentation for texlive-thmbox"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-thmbox-doc-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "54fe4b0f3b5c879808fb55f034fce6e6c5aa0d371cba7d02aea01b9df318f737399795d369a6184ecfebd5341102c3867e0d2bd008309f6531a713584132ac40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
