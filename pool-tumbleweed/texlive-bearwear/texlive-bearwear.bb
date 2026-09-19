SUMMARY = "Shirts to dress TikZbears"
DESCRIPTION = "The package offers tools to create shirts for TikZbears from \
the TikZlings package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-2026.226.0.0.2svn54826-61.2.noarch.rpm"
RPM_HASH = "3e93d93a81467f65657c5245516a53fb9aa05b1767bb2361690010e15d19c333e36048fd9063a2be8af1c85ce4e4ebcad6740a091d36b474effe116280936e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bearwear.sty \
texlive-bearwear"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikzlings-bears.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
