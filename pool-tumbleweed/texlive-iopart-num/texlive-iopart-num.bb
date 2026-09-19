SUMMARY = "Numeric citation style for IOP journals"
DESCRIPTION = "A BibTeX style providing numeric citation in Harvard-like \
format. Intended for use with Institute of Physics (IOP) \
journals, including Journal of Physics."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-iopart-num-2026.226.2.1svn15878-63.2.noarch.rpm"
RPM_HASH = "f3316782bc641ee42c6606291b1908267669ca92a2ae8202acc1c5edde43073638a76669ae61c987854a55e47cd01a325ed962e1ea6d6a84f1635288eb9d6103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num"

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
