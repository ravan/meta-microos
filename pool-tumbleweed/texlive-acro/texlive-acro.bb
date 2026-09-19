SUMMARY = "Typeset acronyms"
DESCRIPTION = "The package enables the author to create acronyms in a simple \
way, and provides means to add them to different 'classes' of \
acronyms. Lists can be created of separate acronym classes. The \
package option 'single' instructs the package to ignore \
acronyms that are used only once in the whole document. As an \
experimental feature the package also offers the option 'sort' \
which automatically sorts the list created by \\printacronyms."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8svn77682"

RPM_NAME = "texlive-acro-2026.226.3.8svn77682-61.2.noarch.rpm"
RPM_HASH = "7ce176b201d55e0db756adc3564e0d779f50e64c01dbe706aaa7ccdfa2cb159fb6643fa041dc955f03e1c63008907dfb48a15c9c0bc35c4bce4e056f41736a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acro-examples.sty \
tex-acro.sty \
tex-acro2.sty \
texlive-acro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pdfcomment.sty \
tex-translations.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xtemplate.sty \
tex-zref-abspage.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
