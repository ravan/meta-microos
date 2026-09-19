SUMMARY = "Documentation for texlive-stix2-type1"
DESCRIPTION = "This package includes the documentation for texlive-stix2-type1"
LICENSE = "OFL-1.1"

PV = "2026.226.2.0.2svn77682"

RPM_NAME = "texlive-stix2-type1-doc-2026.226.2.0.2svn77682-64.2.noarch.rpm"
RPM_HASH = "2fa27a923e64f2c1ddf2b88bd46b42e4147becaa4bf49c499810875625d52c5870733fcd83b34231353cf38b0a48380a55a055fd2fbd53df76f4e671b90ac22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
