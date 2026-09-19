SUMMARY = "Convert one DVI file into another"
DESCRIPTION = "The output DVI file's contents are specified by page selection \
commands; series of pages and page number ranges may be \
specified, as well as inclusions and exclusions. It is now \
maintained as part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-dvidvi-2026.226.svn75712-61.4.noarch.rpm"
RPM_HASH = "af64bac95cf85bca00b20af34ddf007f152682fee15658f4c08bbf66daaa94c386673f31f8e8acc1ed69bc88c4f8277f1a71edaf7027bac08dfea96b490937bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvidvi.1 \
texlive-dvidvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvidvi-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
