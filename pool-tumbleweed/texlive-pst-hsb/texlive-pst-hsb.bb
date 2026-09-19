SUMMARY = "Curves with continuous colours"
DESCRIPTION = "This is a PSTricks-related package. It can plot lines and/or \
curves with continuous colours. Only colours defined in the hsb \
model are supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn66739"

RPM_NAME = "texlive-pst-hsb-2026.226.0.0.03svn66739-59.2.noarch.rpm"
RPM_HASH = "ddd4b9487c6a1361ebddc54306cf5d121bd8599be5a1c31e4e96c455838bba6eec8cc7bd7532b256c089c37468cf526d9c95b0e612e0bfafca546107f659f531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-hsb.sty \
tex-pst-hsb.tex \
texlive-pst-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
