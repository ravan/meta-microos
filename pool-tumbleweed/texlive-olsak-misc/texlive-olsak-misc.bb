SUMMARY = "Collection of plain TeX macros written by Petr Olsak"
DESCRIPTION = "This is a collection of various single-file plain TeX macros \
written by Petr Olsak. The documentation is included in each \
file separately. booklet.tex: re-orders PDF pages and collects \
them for booklet printing circu.tex: features from \
circuitikz.sty enableda cnv.tex: conversion of texts \
cnv-pu.tex: example of usage of cnv.tex --- pdf outlines in \
Unicode cnv-word.tex: example of usage of cnv.tex --- word to \
word conversion eparam.tex: Full expansion during parameter \
scanning fun-coffee.tex: generates splotches in the document \
openclose.tex: repairs balanced text between \\Open ...\\Close \
pair qrcode.tex: QR code generated at TeX level scanbase.tex: \
parser of text-style mysql outputs scancsv.tex: parser of CSV \
format seplist.tex: macros with alternative separators of a \
parameter xmlparser.tex: parser of XML language"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.apr._2025svn74906"

RPM_NAME = "texlive-olsak-misc-2026.226.apr._2025svn74906-61.2.noarch.rpm"
RPM_HASH = "7922e9979d26aea8f0251d14cc94634c727b2c295046fd283b8a5808db7836168a81ff7e3d158b578a2481092ed863a9fb5f8519808f0b8321f54b9e3cfe36e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-booklet.tex \
tex-cropmarks.tex \
tex-qrcode.tex \
tex-scanbase.tex \
tex-scancsv.tex \
tex-xmlparser.tex \
texlive-olsak-misc"

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
