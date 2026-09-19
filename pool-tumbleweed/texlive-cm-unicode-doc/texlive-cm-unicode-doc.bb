SUMMARY = "Documentation for texlive-cm-unicode"
DESCRIPTION = "This package includes the documentation for texlive-cm-unicode"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-doc-2026.226.0.0.7.0svn58661-60.2.noarch.rpm"
RPM_HASH = "974e7d2186ad62538ad5b010d521146915d251b97456707552bde1f91b31d2385e577c7b009746f0092316b4380efc885333ba0db5f710d89774ad95caff85e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-unicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
