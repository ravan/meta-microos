SUMMARY = "A LaTeX style for overlaying text on a PDF"
DESCRIPTION = "It is often desirable to take an existing PDF and easily add \
annotations or text overlaying the PDF. This might arise if you \
wish to add comments to a PDF, fill in a PDF form, or add text \
to a PDF where space has been left for notes. This package \
provides a simple interface to do this without having to resort \
to inserting one page at a time. Some or all of the pages of \
the PDF can be included and not all pages of the PDF need have \
overlayed text. It is also possible to include text between \
pages of the PDF. Another advantage of this package is that the \
overlayed text can be set as normal flowing from one page to \
another or with manual page breaks if you wish. It is also \
possible to use any standard method to position text at \
arbitrary places on a given page."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-pdfoverlay-2026.226.1.3svn77682-58.2.noarch.rpm"
RPM_HASH = "5bd504abaa6bd363d6eb56e7dc7a84cda383063af338167161329ee995fda19bd60ffee3fcb8ac48f3c48486809b471b00404f99549d2aae840c7dacf3ab185f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfoverlay.sty \
texlive-pdfoverlay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
