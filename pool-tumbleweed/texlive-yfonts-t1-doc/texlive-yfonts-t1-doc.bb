SUMMARY = "Documentation for texlive-yfonts-t1"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-t1"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-doc-2026.226.1.0svn36013-59.4.noarch.rpm"
RPM_HASH = "0fb80cced40aadce66fca3aadd01a62c706cf7b4b5a9400fdb652c2e3f3d1a4603b2891f701771d4f93d8b7aa8f587d732fa01b2a8eaa190d0e42cc04c4e051b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
