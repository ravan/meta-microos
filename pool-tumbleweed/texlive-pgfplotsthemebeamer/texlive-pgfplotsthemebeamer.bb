SUMMARY = "Use colours from the current beamer theme in pgfplots"
DESCRIPTION = "A LaTeX package for using colours from the current beamer theme \
in pgfplots diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn71954"

RPM_NAME = "texlive-pgfplotsthemebeamer-2026.226.0.0.2svn71954-58.2.noarch.rpm"
RPM_HASH = "266f8c8c7295ad2bcc73df920151094eb8b7ae0ce097c6c4b14862c2326af89da85890663ba55b1f9890ad3afa80034132f2c1b8023cad3b9bb7cf40cc8aebfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfplotsthemebeamer.sty \
texlive-pgfplotsthemebeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfplots.sty \
texlive \
texlive-beamer \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-pgfplots \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
