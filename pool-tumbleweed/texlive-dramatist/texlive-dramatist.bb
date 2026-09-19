SUMMARY = "Typeset dramas, both in verse and in prose"
DESCRIPTION = "This package is intended for typesetting drama of any length. \
It provides two environments for typesetting dialogues in prose \
or in verse; new document divisions corresponding to acts and \
scenes; macros that control the appearance of characters and \
stage directions; and automatic generation of a `dramatis \
personae' list."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2esvn35866"

RPM_NAME = "texlive-dramatist-2026.226.1.2esvn35866-59.2.noarch.rpm"
RPM_HASH = "9808af4404d85b835ca00b46451a9e96be0a3de8cbb705e48c0ba27cc8ac53ddebcd5b91dfd7e4338b415e86da9ff571db66295ba7cdfb6a4b87607b70164bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dramatist.sty \
texlive-dramatist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
