SUMMARY = "Slides with a simple Power Point like appearance"
DESCRIPTION = "A slide format which produces slides with a simple Power Point \
like appearance. Several useful features include: use of \
standard titlepage to produce title slide; several slide \
environments including plain (page with a title), double slide \
(two column page with slide title), item slide (item list with \
title), left item slide, and right item slide. Logos are placed \
in the upper left corner of each slide if the logo file \
logo.eps is present. Preconfigured in landscape mode by default \
and uses Times Roman by default (originally, it was claimed, \
for simple conversion to PDF format)."
LICENSE = "Artistic-1.0"

PV = "2026.226.svn27354"

RPM_NAME = "texlive-uwmslide-2026.226.svn27354-60.2.noarch.rpm"
RPM_HASH = "d1c74d5a437a2de1b70d02ca47114819a57d9164830075e7555221cfc2bd70a094b2b3c6f8246244e963e926f1db05b54bdf86773bbc44c992d6ddd1e9579a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwmslide.cls \
texlive-uwmslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-epsfig.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
