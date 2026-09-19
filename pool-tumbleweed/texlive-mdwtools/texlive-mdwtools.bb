SUMMARY = "Miscellaneous tools by Mark Wooding"
DESCRIPTION = "This collection of tools includes: support for short commands \
starting with @, macros to sanitise the OT1 encoding of the \
cmtt fonts; a 'do after' command; improved footnote support; \
mathenv for various alignment in maths; list handling; mdwmath \
which adds some minor changes to LaTeX maths; a rewrite of \
LaTeX's tabular and array environments; verbatim handling; and \
syntax diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-2026.226.1.05.4svn15878-59.2.noarch.rpm"
RPM_HASH = "934ddec390cde35e04121c678cdc1db23df5cfb91b6a72d8fca1151d80937026c7423397545c218a093fca81d71835a6e1a85757f3e805de0f2c4e9e261395c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-at.sty \
tex-cmtt.sty \
tex-doafter.sty \
tex-footnote.sty \
tex-mTTcmtt.fd \
tex-mTTenc.def \
tex-mathenv.sty \
tex-mdwlist.sty \
tex-mdwmath.sty \
tex-mdwtab.sty \
tex-sverb.sty \
tex-syntax.sty \
texlive-mdwtools"

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
