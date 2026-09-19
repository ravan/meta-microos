SUMMARY = "Access basic ligatures in legacy TrueType fonts"
DESCRIPTION = "This small and simple package allows LuaLaTeX users to access \
basic ligatures (ff, fi, ffi, fl, ffl) in legacy TrueType fonts \
(those lacking a liga table) accessed via fontspec."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn50912"

RPM_NAME = "texlive-addliga-2026.226.1.0svn50912-61.2.noarch.rpm"
RPM_HASH = "5d96ae9c1c00ae53342c2b9a9e31b46794fd59d02c78f05195e45f7eb73dd364e0a37d1530bf3abf18ccdd727da51a494082687acd4a0b1826ab0c904018e363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addliga.sty \
texlive-addliga"

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
