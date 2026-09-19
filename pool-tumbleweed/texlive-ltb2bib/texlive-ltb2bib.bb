SUMMARY = "Converts amsrefs' .ltb bibliographical databases to BibTeX format"
DESCRIPTION = "This package implements a LaTeX command that converts an \
amsrefs bibliographical database (.ltb) to a BibTeX \
bibliographical database (.bib). ltb2bib is the reverse of the \
'amsxport' option in amsrefs. Typical uses are: produce bib \
entries for some publishers which don't accept amsrefs (Taylor \
& Francis, for example); import an ltb database in a database \
management program, e.g. for sorting; access one's ltb database \
within emacs's RefTeX mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-2026.226.0.0.01svn43746-59.2.noarch.rpm"
RPM_HASH = "ebc1f0c9c0c6d980cfbe7c1f6202734afe3ef907c4f3891e507200c6b608972945052cba188e6b4093f49ff3912e8610e261751d5634b5a9dbcfeff2cb808d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltb2bib.sty \
texlive-ltb2bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsrefs.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
