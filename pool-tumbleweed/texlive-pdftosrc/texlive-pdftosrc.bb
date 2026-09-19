SUMMARY = "Extract source file or stream from PDF file"
DESCRIPTION = "Extracts an embedded source file, or extracts and uncompresses \
a PDF stream given by object number. Developed as part of the \
pdfTeX source tree."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-pdftosrc-2026.226.svn77830-58.2.noarch.rpm"
RPM_HASH = "55e3c4b7802d32c684a1d633dd057e98a38953feaef800575fe6df936fd840e34d7754fe9ccde7dcebd62882622aadd23996e10a5dd2720c2d30441c9353fbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdftosrc.1 \
texlive-pdftools-doc-/usr/share/man/man1/pdftosrc.1.gz \
texlive-pdftosrc"

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
texlive-pdftosrc-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
