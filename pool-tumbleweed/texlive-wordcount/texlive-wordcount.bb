SUMMARY = "Estimate the number of words in a LaTeX document"
DESCRIPTION = "The package provides a relatively easy way of estimating the \
number of words in a LaTeX document that does not require \
dvitty or other DVI converters. It does however require \
something like Unix grep -c that can search a file for a \
particular string and report the number of matching lines. An \
accompanying shell script wordcount.sh contains more \
information in its comments."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn46165"

RPM_NAME = "texlive-wordcount-2026.226.1.7svn46165-60.2.noarch.rpm"
RPM_HASH = "143c94c22cc8d548e6cb5dfbca258ff22cde42be47ec4e39e18120d4e94ab7ac4b07106d58ebea2094602c65facf091e0752d2a50fa5b45c34aa83ebdc7d2698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordcount.tex \
texlive-wordcount"

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
texlive-scripts-bin \
texlive-wordcount-bin"

inherit rpm
