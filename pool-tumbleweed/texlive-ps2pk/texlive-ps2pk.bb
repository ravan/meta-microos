SUMMARY = "Generate a PK font from an Adobe Type 1 font"
DESCRIPTION = "Generates a PK file from an Adobe Type 1 font. PK fonts are (or \
used to be) valuable in enabling previewers to view documents \
generated that use Type 1 fonts. The program makes use of code \
donated to the X consortium by IBM. It is now maintained as \
part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-ps2pk-2026.226.svn75712-59.2.noarch.rpm"
RPM_HASH = "e33094568ec16ec85ff1a89366765341983669996adb42030a2af74a7dee834d81d1ca3c0c745a49b8dbe8961ba19685f100bdfd167b78f7a60caf5df7690676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mag.1 \
man-pfb2pfa.1 \
man-pk2bm.1 \
man-ps2pk.1 \
texlive-ps2pk"

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
texlive-ps2pk-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
