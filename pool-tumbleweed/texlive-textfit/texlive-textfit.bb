SUMMARY = "Fit text to a desired size"
DESCRIPTION = "Package to fit text to a given width or height by scaling the \
font. For example: \\scaletowidth{3in}{This}. (The job is done \
by calculating a magstep and applying it to the current font; \
thus 'This' will be very tall, as well as very wide; to scale \
in just one dimension, use the facilities of the graphicx \
package.)"
LICENSE = "LPPL-1.0"

PV = "2026.227.5svn20591"

RPM_NAME = "texlive-textfit-2026.227.5svn20591-62.2.noarch.rpm"
RPM_HASH = "a0a3efcc35c50850b4a5212ea777cced05446c83146a13ab94c890e74ba96af2e20ce6638e953c2eff9fccfcbab8e9817ca5a7048de69b6180243d0aa26e52ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textfit.sty \
texlive-textfit"

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
