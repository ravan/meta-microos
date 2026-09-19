SUMMARY = "Enhanced display of LaTeX File Information"
DESCRIPTION = "The bundle provides two packages, readprov and myfilist. The \
readprov package provides a means of reading file information \
without loading the body of the file. The myfilist package uses \
readprov and controls what \\listfiles will report."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-2026.226.0.0.81asvn28421-59.2.noarch.rpm"
RPM_HASH = "fbcc338714f2b383ba33e53e7dcbdfc9889c62f9b9f693011f2435cd037c539820a61597f3e732ab5108761c51406743b184912beb65f1c154a2a015379b87d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-myfilist.sty \
tex-readprov.sty \
texlive-fileinfo"

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
