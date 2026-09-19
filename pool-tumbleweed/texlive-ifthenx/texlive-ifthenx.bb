SUMMARY = "Extra tests for \\ifthenelse"
DESCRIPTION = "The package extends the ifthen package, providing extra \
predicates for the package's \\ifthenelse command. The package \
is complementary to xifthen, in that they provide different \
facilities; the two may be loaded in the same document, as long \
as xifthen is loaded first."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-2026.226.0.0.1asvn25819-60.2.noarch.rpm"
RPM_HASH = "03d134285fb7e2cb8d1b747fb0aebe81725df80b00e634ec303facc3d3ce09f5491778c5ffa945b3ba918ae1dfc5522abf958202d3cd47b54ad9a4192056f0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifthenx.sty \
texlive-ifthenx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
