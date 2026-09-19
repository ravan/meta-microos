SUMMARY = "Documentation for texlive-culmus"
DESCRIPTION = "This package includes the documentation for texlive-culmus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-culmus-doc-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "319715b5f0ee805ae443e7062e5d6110ad891ec26bfeaf5eeca23c2c856de7b5512fbedc0a85cd8d821a3b2ebce96753ec03d77e42e069ba7e64bff1f48de550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-culmus-doc"

RDEPENDS:${PN} += ""

inherit rpm
