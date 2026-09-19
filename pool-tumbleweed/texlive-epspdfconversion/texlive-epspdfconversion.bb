SUMMARY = "On-the-fly conversion of EPS to PDF"
DESCRIPTION = "The package calls the epstopdf package to convert EPS graphics \
to PDF, on the fly. It servs as a vehicle for passing \
conversion options (such as grayscale, prepress or pdfversion) \
to the epspdf converter."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-2026.226.0.0.61svn18703-61.4.noarch.rpm"
RPM_HASH = "542da2181a7a6c4365064a58b49f263beffb50b142e6334c56f4f48019351cd393059f6091e5f606b8b330264e5fbedf2eb051774425e0a2a4594c2d5f146506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epspdfconversion.sty \
texlive-epspdfconversion"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epstopdf-base.sty \
tex-graphics.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
