SUMMARY = "LaTeX to RTF Converter"
DESCRIPTION = "LaTeX2RTF is a translator program to convert LaTeX formatted text files into \
“rich text format” (RTF) files. RTF is a published standard format by Microsoft. \
This standard can be ambiguous in places, but RTF is supported by many text \
editors. Specifically, it is supported by Microsoft Word. This means that the \
conversion of a LaTeX document to RTF allows anyone with a copy of Word to \
ponvert LaTeX files to Word .doc or .docx files."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.18a"

RPM_NAME = "latex2rtf-2.3.18a-2.10.aarch64.rpm"
RPM_HASH = "511c278010885e562686476a4720ca4bb5d3bb40716c31e6b5d5c46b7ad1d06522a49ef2983d839809c8fe14af0e6d408b614cb12ed56aa9cb3a84deeaaa61bb"

RPROVIDES:${PN} += "latex2rtf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ImageMagick \
libc.so.6 \
libm.so.6 \
netpbm \
texlive-scheme-basic"

inherit rpm
