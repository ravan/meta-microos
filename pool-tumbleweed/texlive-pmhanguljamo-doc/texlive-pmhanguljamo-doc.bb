SUMMARY = "Documentation for texlive-pmhanguljamo"
DESCRIPTION = "This package includes the documentation for texlive-pmhanguljamo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn78114"

RPM_NAME = "texlive-pmhanguljamo-doc-2026.226.1.3svn78114-59.2.noarch.rpm"
RPM_HASH = "9c7bc81eef385dee6c5cc2c81b84534055281e69dd1cfd944f09f2c84f35a1451e01230a9e92af1bd7ae11a2bfd4f283ca615a6d65d54d55063edb393285ffe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pmhanguljamo-doc-ko \
texlive-pmhanguljamo-doc"

RDEPENDS:${PN} += ""

inherit rpm
