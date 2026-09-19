SUMMARY = "A class for submissions to the proceedings of conferences on JACoW.org"
DESCRIPTION = "The jacow class is used for submissions to the proceedings of \
conferences on Joint Accelerator Conferences Website (JACoW), \
an international collaboration that publishes the proceedings \
of accelerator conferences held around the world."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn63060"

RPM_NAME = "texlive-jacow-2026.226.2.7svn63060-63.2.noarch.rpm"
RPM_HASH = "3e47a334249e18a2b6705b50fb0112bbaba9ef149c0b05972f07e193a833424024fa271b3359939e4138dba884c03639e85c1f3573eeae4745b39be0cde687f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jacow.cls \
texlive-jacow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cite.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fix-cm.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtt.sty \
tex-siunitx.sty \
tex-textcase.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
