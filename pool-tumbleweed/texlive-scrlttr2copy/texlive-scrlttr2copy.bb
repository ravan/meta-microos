SUMMARY = "A letter class option file for the automatic creation of copies"
DESCRIPTION = "The file copy.lco provides the new class option 'copy' for the \
KOMA-Script letter class scrlttr2. If the option 'copy' is \
given, all pages of a specific letter are duplicated with \
background text marking as copies."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-2026.226.0.0.3asvn56733-60.2.noarch.rpm"
RPM_HASH = "6cf7212cb494f9a2135004cc6779f84f5ec9917ff187d1a51048a5002af64804ca5fd6865a764037cbfb029eac5d6a7f5e8f9c6ee64247432b322d8fe6bb61ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy"

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
