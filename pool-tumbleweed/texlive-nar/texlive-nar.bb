SUMMARY = "BibTeX style for Nucleic Acid Research"
DESCRIPTION = "This BibTeX bibliography style is for the journal Nucleic Acid \
Research. It was adapted from the standard unsrt.bst style \
file."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.19svn77682"

RPM_NAME = "texlive-nar-2026.226.3.19svn77682-61.2.noarch.rpm"
RPM_HASH = "9934feda8add4fbc2065897322b20bee4bb3c2c0512d11407e973ef0124e59a331fa10b216d684cc35f10b156d7fe54a5ec2376b683f76715b00694bf0ae893b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nar"

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
