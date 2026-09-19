SUMMARY = "Documentation for texlive-udepcolor"
DESCRIPTION = "This package includes the documentation for texlive-udepcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn69701"

RPM_NAME = "texlive-udepcolor-doc-2026.226.1.0svn69701-60.2.noarch.rpm"
RPM_HASH = "a942706f4996009ae285faf04f23f89d90fd76e42cdab6d886e50500c98412c527a8a03d0b82bb77bcfa47d6dd718f7e6dc5bcd5dee4891efd8f71c49eef8d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udepcolor-doc-es-pe \
texlive-udepcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
