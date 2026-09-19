SUMMARY = "Systematic treatment of 'foreign' words in documents"
DESCRIPTION = "The package supports authors' use of consistent typesetting of \
foreign words in documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn78101"

RPM_NAME = "texlive-foreign-2026.226.2.7svn78101-60.2.noarch.rpm"
RPM_HASH = "36f05db00ae91a9dabb4ab578d5c9cf414f0615fa53b9ebda5fd0cfb918f75a68157c5c43b4aa6e8f5e8867d1824d091cd2660beed37897a2f8eb0a9dfec6d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foreign.sty \
texlive-foreign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpunctuate.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
