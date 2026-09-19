SUMMARY = "A collection of Metafont mode_def's"
DESCRIPTION = "The modes file collects all known Metafont modes for printing \
or display devices, of whatever printing technology. Special \
provision is made for write-white printers, and a 'landscape' \
mode is available, for making suitable fonts for printers with \
pixels whose aspect is non-square. The file also provides \
definitions that make \\specials identifying the mode in \
Metafont's GF output, and put coding information and other \
Xerox-world information in the TFM file."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.4svn77365"

RPM_NAME = "texlive-modes-2026.226.4.4svn77365-61.2.noarch.rpm"
RPM_HASH = "e7dbf5a0e0f93b51cbd662031150cf7b8e76618776abe2ed14415b64ac2a3edf79c14e1e18c79011631a12360380e61c76e8420cea6225c921bee4c79401c9ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modes"

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
