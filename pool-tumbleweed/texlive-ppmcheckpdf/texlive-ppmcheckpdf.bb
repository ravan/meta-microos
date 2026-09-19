SUMMARY = "Convert PDF to PNG and compare PNG files after l3build"
DESCRIPTION = "The build system l3build normally writes the contents of some \
boxes from .lvt files into corresponding .tlg files. Sometimes \
a dependent package adds e.g. the command \\kern0pt, so that \
test files fail, even if the PDF files look the same as before \
and are still correct. The ppmcheckpdf tool offers an \
alternative option for regression testing: instead of printing \
the contents of boxes in .lvt files, PDF files are converted to \
PNG files and you can compare the PNG files after l3build has \
finished its work."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025asvn74165"

RPM_NAME = "texlive-ppmcheckpdf-2026.226.2025asvn74165-59.2.noarch.rpm"
RPM_HASH = "0bdf6af8251caf3a31aa8a244ecd0b08af85bc9f2449a41f07a35efe0d416b107a3fd2b9d5409bfeee7b9bfb4cf7361c9fbdf8da3a6377b94e091c68cd6bdd2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppmcheckpdf"

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
texlive-ppmcheckpdf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
