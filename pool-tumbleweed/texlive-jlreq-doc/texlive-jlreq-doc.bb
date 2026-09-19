SUMMARY = "Documentation for texlive-jlreq"
DESCRIPTION = "This package includes the documentation for texlive-jlreq"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-jlreq-doc-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "ae7acff631ef177a8358855669940476318efe3743eb858d5983baa43f691066818a8be93a3497997daaef3e7e1798abf4a177464f11259d4a2abba70421e86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jlreq-doc-ja \
texlive-jlreq-doc"

RDEPENDS:${PN} += ""

inherit rpm
