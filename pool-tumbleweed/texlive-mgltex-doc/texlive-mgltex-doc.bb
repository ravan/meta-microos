SUMMARY = "Documentation for texlive-mgltex"
DESCRIPTION = "This package includes the documentation for texlive-mgltex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.2svn63255"

RPM_NAME = "texlive-mgltex-doc-2026.226.4.2svn63255-61.2.noarch.rpm"
RPM_HASH = "d2af26c4aae0a402f167b157144aaa29dc38047154b1fec7b09b5aea9a6956a11fd28810630c2eaaa8d89cdc61b67df56e19779d9254b2f46063acc9a3f0d9b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc \
texlive-mgltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
