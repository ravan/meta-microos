SUMMARY = "Documentation for texlive-curves"
DESCRIPTION = "This package includes the documentation for texlive-curves"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.55svn45255"

RPM_NAME = "texlive-curves-doc-2026.226.1.55svn45255-61.2.noarch.rpm"
RPM_HASH = "04a2eeaba19d862f2cfdb73e7853bdd39db4d2c83f91b5aad88f21ded185c3a3c2c3ace6b14f4d3fd611acf191a2da7952c9039022d2b87aabf3bf24a9c02218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curves-doc"

RDEPENDS:${PN} += ""

inherit rpm
