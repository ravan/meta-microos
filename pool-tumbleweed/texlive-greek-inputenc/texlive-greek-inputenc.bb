SUMMARY = "Greek encoding support for inputenc"
DESCRIPTION = "Input encoding definition files for UTF-8, Macintosh Greek, and \
ISO 8859-7 enabling the use of literal characters for Greek \
letters and symbols with 8-bit TeX engines (pdfLaTeX)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn66634"

RPM_NAME = "texlive-greek-inputenc-2026.226.1.9svn66634-60.4.noarch.rpm"
RPM_HASH = "569140ca89bf0bc9bb23b4be22d1eca91afc79adba8d852c33ef2c51e2bde81fc60ac4aff7f925322094e4559d636bc42220af21c5f2dbf722c7bbe76192006b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iso-8859-7.def \
tex-macgreek.def \
texlive-greek-inputenc"

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
