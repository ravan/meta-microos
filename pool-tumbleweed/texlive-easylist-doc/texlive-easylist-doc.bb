SUMMARY = "Documentation for texlive-easylist"
DESCRIPTION = "This package includes the documentation for texlive-easylist"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-easylist-doc-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "596b7714b48d8df4c55df6fac61291c509b4fb61a4c93be2206ce4d9fde850a1166d90144ce21c15a3316df743e254f2da3449873fe7ac6f2aa0b715796becfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
