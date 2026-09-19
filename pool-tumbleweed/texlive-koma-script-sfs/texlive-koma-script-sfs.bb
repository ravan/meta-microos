SUMMARY = "KOMA-Script letter class option for Finnish"
DESCRIPTION = "A koma-script parameter set for letters on A4 paper, complying \
with Finnish standards SFS 2486, 2487 and 2488; suitable for \
window envelopes with window on the left size in the sizes C5, \
C65, E5 and E65 (although, because the address window is \
smaller, for sizes E5 and E65 the address may not fit within \
the window, but ordinary 3-line address should fit)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77050"

RPM_NAME = "texlive-koma-script-sfs-2026.226.1.0svn77050-63.2.noarch.rpm"
RPM_HASH = "19769bfbb7dc1e384bf408db1071ef9ada0431f49b44ee8818ff5e51d028e7b7363c7d3838db4325b20238681209fdccebbfa4934c4ffb898d45698306b6c03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-sfs"

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
