SUMMARY = "Geometric-style sans serif"
DESCRIPTION = "From http://andrewpaglinawan.com/category/typefaces/#quicksand: \
Quicksand is a sans serif type family of three weights plus matching \
obliques and a dash version for display and headings. Influenced by \
the geometric-style sans serif faces that were popular during the \
1920s and 30s, the fonts are based on geometric forms that have been \
optically corrected for better legibility. \
 \
Designers: Andrew Paglinawan"
LICENSE = "OFL-1.1"

PV = "1.0.20120829"

RPM_NAME = "paglinawan-quicksand-fonts-1.0.20120829-7.25.noarch.rpm"
RPM_HASH = "32d843d0872dc372deb3304dae42e56b5f17a02c736f2887ab7c280993eb59c3f32744e17af3e02278f6dc6bd1c76e04ce2f1cc717d180dcb34f0cad66945bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paglinawan-quicksand-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
