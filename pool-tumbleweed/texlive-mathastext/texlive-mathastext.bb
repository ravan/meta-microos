SUMMARY = "Use the text font in maths mode"
DESCRIPTION = "The package uses a text font (usually the document's text font) \
for the letters of the Latin alphabet needed when typesetting \
mathematics. (Optionally, other characters in the font may also \
be used). This facility makes possible (for a document with \
simple mathematics) a far wider choice of text font, with \
little worry that no specially designed accompanying maths \
fonts are available. The package also offers a simple mechanism \
for using many different choices of (text hence, now, maths) \
font in the same document. Of course, using one font for two \
purposes helps produce smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn77682"

RPM_NAME = "texlive-mathastext-2026.226.1.4esvn77682-59.2.noarch.rpm"
RPM_HASH = "2b1135c175c8c5c22d78e3d2a06a9ee2fd483d23d41f7f6c57f6b7bead2652f18f2b41d92b78c4552a7e91bbc5cd03071cf10b7580c53dd89beb6e8f5ebb4a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathastext.sty \
texlive-mathastext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-decimalcomma.sty \
tex-ncccomma.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
