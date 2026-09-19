SUMMARY = "LaTeX support for punk fonts"
DESCRIPTION = "The package and .fd file provide support for Knuth's punk \
fonts. That bundle also offers support within LaTeX; the \
present package is to be preferred."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn27389"

RPM_NAME = "texlive-punk-latex-2026.226.1.1svn27389-60.4.noarch.rpm"
RPM_HASH = "ca63570c780977be5526487e235a5e45ac021110304df08bdc55775b7fdcfcc5215e66946a9c7136c68f815e5ed3638ba594b9229bcd2c509bd2cb3661976d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1pnk.fd \
tex-punk.sty \
texlive-punk-latex"

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
