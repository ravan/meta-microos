SUMMARY = "Deal with substrings in strings"
DESCRIPTION = "The package provides commands to deal with substrings of \
strings. Macros are provided to: determine if one string is a \
substring of another, return the parts of a string before or \
after a substring, and count the number of occurrences of a \
substring."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-substr-2026.226.1.2svn77682-64.2.noarch.rpm"
RPM_HASH = "a39bfcc633832bd4c87a0fcce6efd793a8c3afb9b3bcdd19bd34d17f5b8cb8988f15a7a3caed12b6c81df632662a8cd79ffb4076ad69e041c5d109d19ed19c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-substr.sty \
texlive-substr"

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
