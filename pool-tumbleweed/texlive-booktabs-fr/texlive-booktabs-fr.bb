SUMMARY = "French translation of booktabs documentation"
DESCRIPTION = "The translation comes from a collection provided by Benjamin \
Bayart."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn21948"

RPM_NAME = "texlive-booktabs-fr-2026.226.1.00svn21948-59.2.noarch.rpm"
RPM_HASH = "e9554f7ede7d21967a53f80b01df66db828388628e13ec72bf242c4396e39bcb8accb14683b23f83d64d4b8a355f3a9595e774394277fe5d1f4ec997005ebd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-fr"

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
