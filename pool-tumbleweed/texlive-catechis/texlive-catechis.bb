SUMMARY = "Macros for typesetting catechisms"
DESCRIPTION = "The macros include: format for question-and-answer; comments on \
answers; lengthier explanations of answers; citations. The \
formatting of all the macros is highly (and simply) \
customizable."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn59998"

RPM_NAME = "texlive-catechis-2026.226.2.6svn59998-59.2.noarch.rpm"
RPM_HASH = "fab83f4f77715b0b96324c71b85d53c9ec31aecfcf132db39ca4375b2b3ceb437c5fd194282a3ea316edc4fda88850e40da9a3eb272663f4b7ea9f6b3154e464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catechis.sty \
texlive-catechis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paralist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
