SUMMARY = "Adjust margins of text block"
DESCRIPTION = "The package provides the environment fullwidth, which sets the \
left and right margins in a simple way. There is no constraint \
about page breaks; if you are using the twoside mode, you can \
set the inner and outer margins to avoid the effects of the \
different margins."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-2026.226.0.0.1svn24684-60.2.noarch.rpm"
RPM_HASH = "5c9ee7f7abfaa8b24d34928cdea34fa09a0e22599c41cf81e5123308c9486039c66b050378a9fa5f690ca02429702af885296fd1259b45bb52438a95b1685b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullwidth.sty \
texlive-fullwidth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
