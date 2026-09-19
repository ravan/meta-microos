SUMMARY = "Provides an environment that may be conditionally included"
DESCRIPTION = "This package provides an environment to switch a section of \
code on or off. The code may be placed anywhere in the file (it \
is not limited to the document or the preamble). The motivation \
for this package was to have commands which allow preselection \
based on whether sections of code in a preamble of a template \
are executed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34481"

RPM_NAME = "texlive-codesection-2026.226.0.0.1svn34481-60.2.noarch.rpm"
RPM_HASH = "ddefff9c4e45a32c33871647ae2f5027eb15f02fd19091f463e39f7896b181ffad709a409ff9ad95841f0d2dcb3ac8f21815d27628f5465dc11f6bd4303a1a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codesection.sty \
texlive-codesection"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
