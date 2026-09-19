SUMMARY = "Convert numbers into binary, octal and hexadecimal"
DESCRIPTION = "Provides expandable macros for both fixed-width and \
minimum-width numbers to bases 2, 4, 8 and 16."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-kastrup-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "bb6f814529ac75b5f5c0ff58a67c9108bfeb89a9aacb5c1064503aec0dbb2be995f6ca1b4b4d08c3c38e0449ac7ff3eafe5d7e6d96895f6b4c00e2cd1efc756d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binhex.tex \
texlive-kastrup"

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
