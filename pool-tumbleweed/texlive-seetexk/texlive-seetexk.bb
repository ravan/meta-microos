SUMMARY = "Utilities for manipulating DVI files"
DESCRIPTION = "The collection comprises: dvibook, which will rearrange the \
pages of a DVI file into 'signatures' as used when printing a \
book; dviconcat, for concatenating pages of DVI file(s); \
dviselect, which will select pages from one DVI file to create \
a new DVI file; dvitodvi, which will rearrange the pages of a \
DVI file to create a new file; and libtex, a library for \
manipulating the files, from the old SeeTeX project. The \
utilities are provided as C source with Imakefiles, and an \
MS-DOS version of dvibook is also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57972"

RPM_NAME = "texlive-seetexk-2026.226.svn57972-60.2.noarch.rpm"
RPM_HASH = "20752915aa0c0354bda20da7e2d681ae7f646073436f8143cf9a97ae55dc8afe96ee75742175ac1934d425d32101578c712dd6bbc1714da8fe99a5cc710206d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvibook.1 \
man-dviconcat.1 \
man-dviselect.1 \
man-dvitodvi.1 \
texlive-seetexk"

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
texlive-scripts-bin \
texlive-seetexk-bin"

inherit rpm
