SUMMARY = "Comprehensive chess annotation in LaTeX"
DESCRIPTION = "TeXmate formats chess games from very simple ascii input. The \
clean '1. e4 e5; 2. Nf3 Nc6; 3. Bb5 a6' will produce the same \
results as the sloppier '1 e4 e5; Nf3 Nc6 3.. Bb5 a6'. The \
resulting format is fully customizable. There are 4 levels of \
commentary: 1 is the main game, 2-3 are commentaries. Each has \
its fonts, punctuation marks, etc., and these are also \
customizable. The package includes a tool for the creation of \
diagrams. The package works in conjunction with skak to produce \
diagrams of the current position automatically. For chess \
fonts, the package uses the chessfss system."
LICENSE = "LPPL-1.0"

PV = "2026.227.2svn78101"

RPM_NAME = "texlive-texmate-2026.227.2svn78101-62.2.noarch.rpm"
RPM_HASH = "1508dc293800a57e6c7711fcc65fc2aa32eeff33b993cd779098818a98138cf93754880cdd48b1722c19d364a0260b163a8ad1e8918d1fc8956581c71de33e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texmate.sty \
texlive-texmate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-chessfss.sty \
tex-skak.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
