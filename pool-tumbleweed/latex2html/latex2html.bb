SUMMARY = "LaTeX to HTML Converter"
DESCRIPTION = "LaTeX2HTML lets you convert basic LaTeX documents into the HTML \
format. This allows both a written and online version even of older \
LaTeX texts."
LICENSE = "GPL-2.0-or-later"

PV = "2026"

RPM_NAME = "latex2html-2026-1.3.noarch.rpm"
RPM_HASH = "d0bda86ac0d76ca4261f8f042f2e168213ffca5dfe6f3ebeea4556d751e4270f2603179df4510b257a679b4692d26d88552241f7c8b5dc7143d2296bb8f62624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html \
perl-L2hos \
perl-L2hos--Dos \
perl-L2hos--Mac \
perl-L2hos--OS2 \
perl-L2hos--Unix \
perl-L2hos--Win32 \
perl-cfgcache"

RDEPENDS:${PN} += "/usr/bin/perl \
ghostscript-any \
latex2html-pngicons \
netpbm \
perl \
texlive-dvips \
texlive-latex \
texlive-preview"

inherit rpm
