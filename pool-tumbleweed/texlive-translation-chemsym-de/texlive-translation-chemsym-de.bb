SUMMARY = "German version of chemsym"
DESCRIPTION = "This is a 'translation' of the chemsym documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23804"

RPM_NAME = "texlive-translation-chemsym-de-2026.226.svn23804-59.2.noarch.rpm"
RPM_HASH = "b48f9e019fa14f8f074f8ded72297d36a790b15ba68ab075b64e32bbd85c171a91441a285b8c702e9b6074929f07aa34abfdd6eea463b5d8b01b4795b2e367bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-chemsym-de"

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
