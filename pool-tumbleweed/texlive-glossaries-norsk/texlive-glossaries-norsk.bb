SUMMARY = "Norsk Bokmal language module for the glossaries Package"
DESCRIPTION = "This package adds Norwegian Bokmal translations for the \
glossaries package. These will be loaded automatically when the \
babel package is loaded with the option norsk."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67141"

RPM_NAME = "texlive-glossaries-norsk-2026.226.1.0svn67141-60.4.noarch.rpm"
RPM_HASH = "bf491aa4be2c023b7e05213c5c63e2b66274d399c849bb381aed4c5e8f569810eced5d16892ec2e7a2a11d8d08c8b47e2b48f9c461f997b26e1083940b97db09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-norsk.ldf \
texlive-glossaries-norsk"

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
