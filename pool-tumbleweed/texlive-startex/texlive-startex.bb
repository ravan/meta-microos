SUMMARY = "An XML-inspired format for student use"
DESCRIPTION = "A TeX format designed to help students write short reports and \
essays. It provides the user with a suitable set of commands \
for such a task. It is also more robust than plain TeX and \
LaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.04svn69742"

RPM_NAME = "texlive-startex-2026.226.1.04svn69742-64.2.noarch.rpm"
RPM_HASH = "251a0bbe60cc89e6e98b4671a906bcda6cf89cfbc11e87884e6ebbabe19308e02a607e7b7b6b0b2e4fdd07dd312d7b07bad5113df5a2c3a7ee7e4c6657808e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-startex.tex \
texlive-startex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
