SUMMARY = "'Steal' small capitals"
DESCRIPTION = "This little package is mainly meant to be used when there is a \
(TrueType or OpenType) font that does not provide real small \
capitals. As a workaround, this package helps to borrow, or \
'steal', the small capitals from another font. This might also \
be useful in the rare case that someone does not like the \
present small capitals, and wants to change them, or likes \
those from another font better. To achieve the borrowing, one \
only needs to load the package and specify the name of the \
target font via the from option. Package dependencies: pgfopts, \
iftex, fontspec."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64967"

RPM_NAME = "texlive-stealcaps-2026.226.1.1svn64967-64.2.noarch.rpm"
RPM_HASH = "08af2225e350a10aebbba6c73b667d6bc5ab55129a451086c863870e65436ae7fda2e92970d5a8b8122177360a60b1da1be7422f9208da90810d49b5783af111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stealcaps.sty \
texlive-stealcaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
