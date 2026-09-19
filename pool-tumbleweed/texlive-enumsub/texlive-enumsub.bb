SUMMARY = "Aligned inline sublists for enumitem"
DESCRIPTION = "This package provides seamless integration between enumitem and \
inline sublists with perfect alignment and automatic numbering. \
It solves the common alignment inconsistencies that occur when \
trying to combine the enumitem and tasks packages. The package \
depends on enumitem, xparse, array, and etoolbox, and provides \
a new command \\enumsub for rendering inline sublists with \
customizable numbering and spacing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75967"

RPM_NAME = "texlive-enumsub-2026.226.1.0svn75967-61.4.noarch.rpm"
RPM_HASH = "64f22df0f6f733f9d5ca804643cc1bf7a376377eff558480009ae5a58a3cd035d4203c9b56c31c95c953f117a565af8b284789e67411cdae5379ca2969c14c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumsub.sty \
texlive-enumsub"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
