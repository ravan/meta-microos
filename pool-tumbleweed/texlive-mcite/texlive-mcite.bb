SUMMARY = "Multiple items in a single citation"
DESCRIPTION = "The mcite package allows the user to collapse multiple \
citations into one, as is customary in physics journals. The \
package requires a customised BibTeX style for its work; the \
documentation explains how to do that customisation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-mcite-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "a8ab23bfd860689e15eafe8260b2ae2f8a93f561dde5450b5fe9bca12257ab8ddb52b626ac2942b44ea6d50f0abaffb3823f119d662ed3ce5b08614dd5749439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcite.sty \
texlive-mcite"

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
