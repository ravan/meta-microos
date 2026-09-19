SUMMARY = "Documentation for texlive-lato"
DESCRIPTION = "This package includes the documentation for texlive-lato"
LICENSE = "OFL-1.1"

PV = "2026.226.3.3svn77682"

RPM_NAME = "texlive-lato-doc-2026.226.3.3svn77682-61.2.noarch.rpm"
RPM_HASH = "cf86c81e1fcee8ce8fd2a2df75cadc838e9ddf56351bba16d39c44d81b9f371e5654491926549a2093d21983d72f03ed233a9c7ea864c757553c24e8204451f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lato-doc"

RDEPENDS:${PN} += ""

inherit rpm
