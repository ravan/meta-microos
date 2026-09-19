SUMMARY = "Make posters of ISO A3 size and larger"
DESCRIPTION = "This collection of files contains LaTeX packages for posters of \
ISO A3 size and larger (ISO A0 is the default size). American \
paper sizes and custom paper are supported. In particular, \
sciposter.cls defines a document class which allows cutting and \
pasting most of an article to a poster without any editing \
(save reducing the size) -- see the manual. Sciposter does work \
for LaTeX, not just pdfLaTeX. However, xdvi produces strange \
results, though a recent version of dvips does create good \
ps-files from the dvi files. Also note that logos must either \
be put in the current working directory or in the directories \
of your LaTeX distribution. For some reason graphicspath \
settings are ignored."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.18svn15878"

RPM_NAME = "texlive-sciposter-2026.226.1.18svn15878-60.2.noarch.rpm"
RPM_HASH = "0598853572d44a819a2691405364a0b0657c3e631f73ca55d87da9900acfa29373f615c5e40f7e2e5b2ecd5a4ae9b7f856b592ef8ad7d47ef135a09e29fc0675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paperb0.cfg \
tex-paperb1.cfg \
tex-paperb2.cfg \
tex-paperb3.cfg \
tex-papercustom.cfg \
tex-paperra0.cfg \
tex-paperra1.cfg \
tex-paperra2.cfg \
tex-sciposter.cls \
texlive-sciposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a0size.sty \
tex-article.cls \
tex-boxedminipage.sty \
tex-color.sty \
tex-graphics.sty \
tex-ifthen.sty \
tex-lettrine.sty \
tex-shadow.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
