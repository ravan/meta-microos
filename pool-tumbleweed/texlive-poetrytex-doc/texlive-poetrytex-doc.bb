SUMMARY = "Documentation for texlive-poetrytex"
DESCRIPTION = "This package includes the documentation for texlive-poetrytex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn76924"

RPM_NAME = "texlive-poetrytex-doc-2026.226.3.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "64256d305d128851d350b5db779460636cb1c3e580cf22be910f5f5926c7b472ca11e2d5fa632b9c01a881bdc3c8817582f61ccbacacfa74149cbde081bf867f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetrytex-doc"

RDEPENDS:${PN} += ""

inherit rpm
