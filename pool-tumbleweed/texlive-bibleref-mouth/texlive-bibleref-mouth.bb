SUMMARY = "Consistent formatting of Bible references"
DESCRIPTION = "The package allows Bible references to be formatted in a \
consistent way. It is similar to the bibleref package, except \
that the formatting macros are all purely expandable -- that \
is, they are all implemented in TeX's mouth. This means that \
they can be used in any expandable context, such as an argument \
to a \\url command."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-2026.226.1.0svn25527-61.2.noarch.rpm"
RPM_HASH = "0ee2ebb5611d1a5b94eb33ab1b25c7f6884ea4c30bfd69e9744c54e4889b68c2fcf6dee59fb8cca76ec858f752261a8f91db64bc06ec204ae6480fb9c552c7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-mouth.sty \
texlive-bibleref-mouth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fmtcount.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
