SUMMARY = "Create quizzes like in TV shows"
DESCRIPTION = "This LaTeX package permits to create quizzes in the style of \
the TV shows << Qui veut gagner des millions ? >> ('Who Wants \
to Be a Millionaire?') or << Tout le monde veut prendre sa \
place ! >>."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.6svn75977"

RPM_NAME = "texlive-quizztex-2026.226.0.0.1.6svn75977-60.4.noarch.rpm"
RPM_HASH = "bb0172b0c658604660142c6bb18cb04ff4115d709d45f06d0b1e2acaf05d766c6651b14a95d1c2c90af7f4456791915ca7225c3b5824e70d1cdc4a430e481c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quizztex.sty \
texlive-quizztex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
