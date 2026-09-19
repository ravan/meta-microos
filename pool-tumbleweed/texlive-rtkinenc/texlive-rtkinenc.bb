SUMMARY = "Input encoding with fallback procedures"
DESCRIPTION = "The rtkinenc package is functionally similar to the standard \
LaTeX package inputenc: both set up active characters so that \
an input character outside the range of 7-bit visible ASCII is \
converted into one or more corresponding LaTeX commands. The \
main difference lies in that rtkinenc allows the user to \
specify a fallback procedure to use when the text command \
corresponding to some input character isn't available. Names of \
commands in rtkinenc have been selected so that it can read \
inputenc encoding definition files, and the aim is that \
rtkinenc should be backwards compatible with inputenc. rtkinenc \
is not a new version of inputenc though, nor is it part of \
standard LaTeX. For an example of how rtkinenc is used, the \
user may look at the tclldoc class."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-rtkinenc-2026.226.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "741777144117d7115d7c972d547e3474b7e8e909b5df521fe717eb650f61a93cbd5f072d09f8982bd46cd61db0a73459d5b5f8c7935a617f11e1d8037c0255a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rtkinenc.sty \
texlive-rtkinenc"

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
