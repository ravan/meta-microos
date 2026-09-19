SUMMARY = "Documentation for texlive-xduts"
DESCRIPTION = "This package includes the documentation for texlive-xduts"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.2.7.2svn76924"

RPM_NAME = "texlive-xduts-doc-2026.226.6.2.7.2svn76924-59.4.noarch.rpm"
RPM_HASH = "e30d78c52fba278da661815a4799adddb7ce1dc11e25b7a8836670cc0012e52fece3e5183507b5a9ecb1572d5e2754d99e7153b18eb0bba2c5c7f58bc09e872b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xduts-doc-zh \
texlive-xduts-doc"

RDEPENDS:${PN} += ""

inherit rpm
