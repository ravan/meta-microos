SUMMARY = "Draw Bernoulli trees with TikZ"
DESCRIPTION = "This is a package for representing Bernoulli trees with \
PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn73069"

RPM_NAME = "texlive-tkz-bernoulli-2026.226.0.0.1.3svn73069-59.2.noarch.rpm"
RPM_HASH = "054c2533f63167e24995727ae218b8581e831f16a94b11b9cdd6645896b730c48cb8bb293d215e71a6e5e92ce7306e0db4d1babafd16c9ea366f825c3bf8d15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-bernoulli.sty \
texlive-tkz-bernoulli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgffor.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintbinhex.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
