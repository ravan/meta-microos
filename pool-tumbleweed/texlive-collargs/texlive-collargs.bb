SUMMARY = "Collect arguments of any command"
DESCRIPTION = "This is a cross-format package providing a command which can \
determine the argument scope of any command whose argument \
structure conforms to xparse's argument specification. It was \
implemented as an auxiliary package of Advice ... which in turn \
was implemented as an auxiliary package of Memoize. This is why \
it is, somewhat unconventionally, documented alongside that \
package. This applies to both the manual and the documented \
code listing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn70689"

RPM_NAME = "texlive-collargs-2026.226.1.2.0svn70689-60.2.noarch.rpm"
RPM_HASH = "64f7347f04d6c21d70d06a9a4b862cb8ebf32e662d2fc02fa808c8b2212016bfa0812b0f3db0fa271684137097bc793e9e7df89dcc5ea4ca1baf57019bd8f508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collargs.sty \
tex-collargs.tex \
tex-t-collargs.tex \
texlive-collargs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
