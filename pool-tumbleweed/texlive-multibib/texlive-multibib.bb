SUMMARY = "Multiple bibliographies within one document"
DESCRIPTION = "The package the creation of references to multiple \
bibliographies within one document. It thus provides \
complementary functionality to packages like bibunits and \
chapterbib, which allow the creation of one bibliography for \
multiple, but different parts of the document. Multibib is \
compatible with inlinebib, natbib, and koma-script."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-multibib-2026.226.1.4svn77682-61.2.noarch.rpm"
RPM_HASH = "48c457500dc0e3217b6b1ec860bfaec89eff139d7144ee4caa0c534fee1c59fe2197d7fd5d446db3b70fae585149fea43abd440403abb5d254162484677888fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibib.sty \
texlive-multibib"

RDEPENDS:${PN} += "/usr/bin/sh \
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
