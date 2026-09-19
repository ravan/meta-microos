SUMMARY = "Provide \\listfiles alignment"
DESCRIPTION = "The package extends longnamefilelist, keeping separate columns \
for date, version and 'caption' (the caption now separately \
listed). Alignment is not disturbed by short file name \
extensions, such as '.fd'. The package is not compatible with \
longnamefilelist: users need to re-read the documentation. \
Options hashes and sizes are provided for \\listfiles, for use \
with LaTeX formats 2024-06-01 or newer."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9csvn77682"

RPM_NAME = "texlive-nicefilelist-2026.226.0.0.9csvn77682-61.2.noarch.rpm"
RPM_HASH = "802610da7f0391b2a6237645b6b03a9ecbab02a7ebf591240f46da686c12d0458e210a8810ce89fc65ee67eff03d0fa754476ee8b99c054609dc9a67f673472e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicefilelist.sty \
texlive-nicefilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hardwrap.sty \
tex-monofill.sty \
tex-myfilist.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
