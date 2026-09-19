SUMMARY = "Sophisticated verbatim text"
DESCRIPTION = "Flexible handling of verbatim text including: verbatim commands \
in footnotes; a variety of verbatim environments with many \
parameters; ability to define new customized verbatim \
environments; save and restore verbatim text and environments; \
write and read files in verbatim mode; build 'example' \
environments (showing both result and verbatim source)."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn77682"

RPM_NAME = "texlive-fancyvrb-2026.226.4.6svn77682-59.2.noarch.rpm"
RPM_HASH = "60777734f26bb03421c73ac329a595f4dfaa6743557d7ee09a690f6dd2536866c7f6ecb2b065fe644c4cc84d0bed84a18e537f4f3a06c08a581b43ef4aae2382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyvrb-ex.sty \
tex-fancyvrb.sty \
tex-hbaw.sty \
tex-hcolor.sty \
texlive-fancyvrb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pstricks.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
