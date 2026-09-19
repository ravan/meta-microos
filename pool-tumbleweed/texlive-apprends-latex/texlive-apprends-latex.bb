SUMMARY = "Apprends LaTeX!"
DESCRIPTION = "Apprends LaTeX! ('Learn LaTeX', in English) is French \
documentation for LaTeX beginners."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.02svn19306"

RPM_NAME = "texlive-apprends-latex-2026.226.4.02svn19306-61.2.noarch.rpm"
RPM_HASH = "d544de12e67b0e3126efbb9e747a4865bdea1c96e495c5c8d8c4a438c26a53811ba753592d89239202af96b40b718c4d10327fa50aca5a20686cbe72c6990929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprends-latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
