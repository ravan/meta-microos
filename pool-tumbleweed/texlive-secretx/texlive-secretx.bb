SUMMARY = "Put security classification marks in a document"
DESCRIPTION = "This package provides a set of macros for marking paragraphs in \
a document with a leading string and modifying the header and \
the footer of each page. It includes environmentS for marking \
large sections of text and environments for boxing figures and \
tables. This is the spiritual successor to secret.sty but adds \
the feature of marking the header and the footer correctly."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10.9svn77296"

RPM_NAME = "texlive-secretx-2026.226.0.0.10.9svn77296-60.2.noarch.rpm"
RPM_HASH = "c84b82c4f6b03deac49b9406bc728df08eba48d84f8b6e8f6ce602acb34db03682901177715994a9c62ec48586e062a664230d8c5970383af719117d12028592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-secretx.sty \
texlive-secretx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-everyhook.sty \
tex-fancyhdr.sty \
tex-kvoptions.sty \
tex-tcolorbox.sty \
tex-zref-abspage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
