SUMMARY = "Documentation for texlive-koma-script-sfs"
DESCRIPTION = "This package includes the documentation for texlive-koma-script-sfs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77050"

RPM_NAME = "texlive-koma-script-sfs-doc-2026.226.1.0svn77050-63.2.noarch.rpm"
RPM_HASH = "c9efc436ad7a90552661723ee092694bf5e544eb4ea1ac3c50277c32d24cde64330ac9ec9af30ca811303136991f960f61987411f4c06e7f3dffc5970ad7b5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-koma-script-sfs-doc-fi \
texlive-koma-script-sfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
