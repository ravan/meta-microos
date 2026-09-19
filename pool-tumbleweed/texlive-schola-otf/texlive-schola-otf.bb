SUMMARY = "Using the OpenType fonts TeX Gyre schola"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font TeX Gyre Schola for text \
and math. The missing typefaces like bold math and slanted text \
are also defined"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-schola-otf-2026.226.0.0.01svn77682-60.2.noarch.rpm"
RPM_HASH = "334a18894e7eace4e907723ddf0f26869b51833120fdece76fac4c539c957d50e746f62b215eb213f6d12d70e8bfc80dc8fc73cac4835ef4eb8672ea9ebc7883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schola-otf.sty \
texlive-schola-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
