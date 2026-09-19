SUMMARY = "String manipulation in LaTeX"
DESCRIPTION = "Coolstr is a subpackage of the cool bundle that deals with the \
manipulation of strings. A string is defined as a sequence of \
characters (not tokens). The package provides the ability to \
access a specific character of a string, as well as determine \
if the string contains numeric or integer data."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.2.2svn67015"

RPM_NAME = "texlive-coolstr-2026.226.2.2svn67015-61.2.noarch.rpm"
RPM_HASH = "59a3b9bbafdac7da7103dcceb8bd930975815118d567f6bcc4f94aebfc4fb8d907aff2bfab6cacab5b595e2be915d10bffa92dccf0d794da174a00570eac0733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolstr.sty \
texlive-coolstr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
