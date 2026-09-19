SUMMARY = "Persian translations of classic BibTeX styles"
DESCRIPTION = "Currently 9 files: acm-fa.bst, asa-fa.bst, chicago-fa.bst, \
ieeetr-fa.bst, plain-fa-inLTR-beamer.bst, plain-fa-inLTR.bst, \
plain-fa.bst, plainnat-fa.bst and unsrt-fa.bst are modified for \
Persian documents prepared with XePersian (which the present \
package depends on). The Persian .bst files can simultaneously \
handle both Latin and Persian references. A file cp1256fa.csf \
is provided for correct sorting of Persian references and three \
fields LANGUAGE, TRANSLATOR and AUTHORFA are defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn76790"

RPM_NAME = "texlive-persian-bib-2026.226.0.0.9svn76790-58.2.noarch.rpm"
RPM_HASH = "bc9386e468f436d14318156a350349951221635ff743f8218c11a7885b8d0ff4b4a439c86113a0fc6c58e4b9b9d4aafe6acea679af3c8117332e3eef7f5b8690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-persian-bib"

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
