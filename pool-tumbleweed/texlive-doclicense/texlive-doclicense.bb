SUMMARY = "Support for putting documents under a license"
DESCRIPTION = "This package allows you to put your document under a license \
and include a link to read about the license or include an icon \
or image of the license. Currently, only Creative Commons is \
supported, but this package is designed to handle all kinds of \
licenses."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3.0svn77682"

RPM_NAME = "texlive-doclicense-2026.226.3.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "8cb8dcfcc1822ab5faf60c88404d94e7f87504eba8ebb30db9bf10d829500e1061ae1daab561c945843e786b4c991a8f7402a12d9935eb610b69a062e0638e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doclicense-CC-by-3.0-latex.tex \
tex-doclicense-CC-by-3.0-plaintext.tex \
tex-doclicense-CC-by-4.0-latex.tex \
tex-doclicense-CC-by-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-3.0-latex.tex \
tex-doclicense-CC-by-nc-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-4.0-latex.tex \
tex-doclicense-CC-by-nc-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-nd-3.0-latex.tex \
tex-doclicense-CC-by-nc-nd-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-nd-4.0-latex.tex \
tex-doclicense-CC-by-nc-nd-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-sa-3.0-latex.tex \
tex-doclicense-CC-by-nc-sa-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-sa-4.0-latex.tex \
tex-doclicense-CC-by-nc-sa-4.0-plaintext.tex \
tex-doclicense-CC-by-nd-3.0-latex.tex \
tex-doclicense-CC-by-nd-3.0-plaintext.tex \
tex-doclicense-CC-by-nd-4.0-latex.tex \
tex-doclicense-CC-by-nd-4.0-plaintext.tex \
tex-doclicense-CC-by-sa-3.0-latex.tex \
tex-doclicense-CC-by-sa-3.0-plaintext.tex \
tex-doclicense-CC-by-sa-4.0-latex.tex \
tex-doclicense-CC-by-sa-4.0-plaintext.tex \
tex-doclicense-CC-zero-1.0-latex.tex \
tex-doclicense-CC-zero-1.0-plaintext.tex \
tex-doclicense-UKenglish.ldf \
tex-doclicense-USenglish.ldf \
tex-doclicense-acadian.ldf \
tex-doclicense-american.ldf \
tex-doclicense-australian.ldf \
tex-doclicense-austrian.ldf \
tex-doclicense-brazilian.ldf \
tex-doclicense-british.ldf \
tex-doclicense-bulgarian.ldf \
tex-doclicense-canadian.ldf \
tex-doclicense-canadien.ldf \
tex-doclicense-catalan.ldf \
tex-doclicense-chinese-gbk.ldf \
tex-doclicense-chinese-tw.ldf \
tex-doclicense-chinese-utf8.ldf \
tex-doclicense-croatian.ldf \
tex-doclicense-english.ldf \
tex-doclicense-esperanto.ldf \
tex-doclicense-french.ldf \
tex-doclicense-galician.ldf \
tex-doclicense-german.ldf \
tex-doclicense-greek.ldf \
tex-doclicense-italian.ldf \
tex-doclicense-japanese.ldf \
tex-doclicense-marathi.ldf \
tex-doclicense-naustrian.ldf \
tex-doclicense-newzealand.ldf \
tex-doclicense-ngerman.ldf \
tex-doclicense-nswissgerman.ldf \
tex-doclicense-polish.ldf \
tex-doclicense-portuguese.ldf \
tex-doclicense-russian.ldf \
tex-doclicense-spanish.ldf \
tex-doclicense-swedish.ldf \
tex-doclicense-swissgerman.ldf \
tex-doclicense-ukrainian.ldf \
tex-doclicense.sty \
texlive-doclicense"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ccicons.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-kvoptions.sty \
tex-ragged2e.sty \
tex-verbatim.sty \
tex-xifthen.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
