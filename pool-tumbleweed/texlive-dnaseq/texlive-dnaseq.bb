SUMMARY = "Format DNA base sequences"
DESCRIPTION = "Defines a means of specifying sequences of bases. The bases may \
be numbered (per line) and you may specify that subsequences be \
coloured. For a more 'vanilla-flavoured' way of typesetting \
base sequences, the user might consider the seqsplit package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-2026.226.0.0.01svn17194-59.2.noarch.rpm"
RPM_HASH = "0e25c898e40db550feee5a09c38fabe585bc297ec3e610ff955880cb44ba11245beadc2350de56c9772fb385afdeea4f29333f0968d1fe1e5bef77b0fe27794d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dnaseq.sty \
texlive-dnaseq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
