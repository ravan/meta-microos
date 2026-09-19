SUMMARY = "Consolidated WEB macros for DVI and PDF output"
DESCRIPTION = "The original WEB system by Donald Knuth has the macros \
webmac.tex that produce DVI output only; for historic reasons, \
it will never be modified (apart from catastrophic errors). Han \
The Thanh has modified these macros in his pdfwebmac.tex for \
PDF output (only) with pdfTeX. Jonathan Kew's XeTeX has similar \
macros xewebmac.tex by Khaled Hosny that modify webmac.tex for \
PDF output; these macros can only be used with a specific 'TeX \
engine' each. The present pwebmac package integrates these \
three WEB macro files similar to cwebmac.tex in Silvio Levy's \
and Don Knuth's CWEB system, so pwebmac.tex can be used with \
'plain TeX', pdfTeX, and XeTeX alike. Its initial application \
is the production of PDF files for all major WEB programs for \
'TeX and friends' as distributed in TeX Live. For this purpose, \
the shell script makeall was whipped together; it provides \
various commandline options and works around several 'quirks' \
in the WEB sources. WEB programmers who want to use pwebmac.tex \
instead of the default webmac.tex in their programs have to \
change the first line in the TeX file created by weave. From \
there, all depends on the 'TeX engine' you use."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.5.1svn74648"

RPM_NAME = "texlive-pwebmac-2026.226.5.1svn74648-60.4.noarch.rpm"
RPM_HASH = "566ad34e238dbf41a3af78d3e73ee29845f2ea93adfa0f5b5e02bc21d668b4ecddff148d9cca154887a54a35ce230c2bc369ee5b85c72ee7bd18affafb120691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pwebmac.tex \
texlive-pwebmac"

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
