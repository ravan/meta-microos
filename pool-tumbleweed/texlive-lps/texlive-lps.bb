SUMMARY = "Class for 'Logic and Philosophy of Science'"
DESCRIPTION = "The 'Logic and Philosophy of Science' journal is an online \
publication of the University of Trieste (Italy). The class \
builds on the standard article class to offer a format that \
LaTeX authors may use when submitting to the journal."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn21322"

RPM_NAME = "texlive-lps-2026.226.0.0.7svn21322-61.2.noarch.rpm"
RPM_HASH = "75d6eae5e5f4f03c869d2e200ba1da9db27dec1ad09f3fc034f041d1b20b6b89c4865ead0fe5c808a5d728803da31a4ddf3dfd56cefd14b07183fd7698798087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lps.cls \
texlive-lps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-lastpage.sty \
tex-mathptmx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
