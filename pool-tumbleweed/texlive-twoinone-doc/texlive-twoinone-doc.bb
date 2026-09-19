SUMMARY = "Documentation for texlive-twoinone"
DESCRIPTION = "This package includes the documentation for texlive-twoinone"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17024"

RPM_NAME = "texlive-twoinone-doc-2026.226.svn17024-59.2.noarch.rpm"
RPM_HASH = "c0fad7726f7f96d7b0d0dada623f18eed4915728b57321505b3ed6306dbf92be216816b3579535b16f2549b8b04ad01e9b336f6c4b361a77f0efc903c2605ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoinone-doc"

RDEPENDS:${PN} += ""

inherit rpm
