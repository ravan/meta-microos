SUMMARY = "Copy DVI files while expanding VF (virtual font) references"
DESCRIPTION = "DVIcopy is a utility program that allows one to convert a DVI \
file that references composite fonts (VF) into an equivalent \
DVI file that does not contain such references. It also serves \
as a basis for writing DVI drivers (much like DVItype). The \
ODVIcopy variant does the same job for Omega/Aleph's output, \
modified to support their .ofm font format."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77830"

RPM_NAME = "texlive-dvicopy-2026.226.1.6svn77830-61.4.noarch.rpm"
RPM_HASH = "c3a31ad4ab2ceafcc5f2ce6ac6a2147969c425f8128ee727dddbffd3bcb22f58c9dca27eed41a07a8102da868050b77bdde9a0eee97766cca744db43517e1e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvicopy.1 \
texlive-dvicopy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvicopy-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
