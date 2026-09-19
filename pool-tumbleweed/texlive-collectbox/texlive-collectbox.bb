SUMMARY = "Collect and process macro arguments as boxes"
DESCRIPTION = "The package provides macros to collect and process a macro \
argument (i.e., something which looks like a macro argument) as \
a horizontal box rather than as a real macro argument. The \
'arguments' are stored as if they had been saved by \\savebox or \
by the lrbox environment. Grouping tokens \\bgroup and \\egroup \
may be used, which allows the user to have the beginning and \
end of a group in different macro invocations, or to place them \
in the begin and end code of an environment. Arguments may \
contain verbatim material or other special use of characters. \
The macros were designed for use within other macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4csvn77682"

RPM_NAME = "texlive-collectbox-2026.226.0.0.4csvn77682-60.2.noarch.rpm"
RPM_HASH = "83fd604cb60105f305dda1cfb9c388d862a82473a352d14a60bdf9c91015aec183d0d9b6dc2d881831be006dde5c95d3ec33cf2946addddc36ae6e0eac935a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collectbox.sty \
texlive-collectbox"

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
