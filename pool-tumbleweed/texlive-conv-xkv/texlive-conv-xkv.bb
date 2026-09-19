SUMMARY = "Create new key-value syntax"
DESCRIPTION = "This small package supports key-value syntax other than the \
standard LaTeX syntax of <key>=<value>. Using this package, \
create key-values of the form <key>:<value> or <key>-><value>, \
for example. The package converts the new notation to xkeyval \
notation and passes it on to xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn43558"

RPM_NAME = "texlive-conv-xkv-2026.226.svn43558-61.2.noarch.rpm"
RPM_HASH = "e977a63becfa05ac98205909a0b716780976b7375058dd4686ee211b76aa00e6f5d9a154a57aec1259b6f2b14503070f8da688184bb61473aa66dd5e4760c1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conv-xkv.sty \
texlive-conv-xkv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
