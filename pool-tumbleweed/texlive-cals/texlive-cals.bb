SUMMARY = "Multipage tables with wide range of features"
DESCRIPTION = "The package is a set of macros to typeset multipage tables with \
repeatable headers and footers, with cells spanned over rows \
and columns. Decorations are supported: padding, background \
color, width of separation rules. The code is compatible with \
multicol and bidi."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.2svn43003"

RPM_NAME = "texlive-cals-2026.226.2.4.2svn43003-59.2.noarch.rpm"
RPM_HASH = "7873bb6f00b0bb3c1c6d40331292680290b10da9fb881346c82a9c509187fc45a67682248f6d8289bc64707cf77f75817060d20c44a6a308f747e73266d831f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cals.sty \
texlive-cals"

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
