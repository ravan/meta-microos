SUMMARY = "The TeXLive Formatting System"
DESCRIPTION = "After installing texlive and the package texlive-latex, find a large \
selection of documentation for TeX, LaTeX, and various layout styles in \
/usr/share/texmf/doc. \
 \
TeX (pronounced tech) is an interpreter for text formatting and was \
developed by Donald E. Knuth.  It works with control and macro commands \
on a text file. Working with TeX is similar to typesetting methods. \
LaTeX is a complex macro package that removes the cryptical TeX \
interface and does most of the work for the user. \
 \
TeX uses special fonts produced by the MetaFont program. Various \
printer drivers and an X11 viewer are also included in this package. \
The teTeX package is based on the standard TeX package of Karl Berry, \
which makes configuration much easier. It is also possible to use \
PostScript fonts. A real PostScript printer is required, however. If \
the ghostscript (gs) package is installed, all drivers for printing and \
viewing can use these fonts. Note, however, that the fonts included in \
the ghostscript package are not identical to Adobe's PostScript fonts. \
The copyright prohibids us to include them on the CD. \
 \
Besides these features, the programs MakeIndex (for producing indexes) \
and BibTeX (for literature data processing) exist. \
 \
The texlive package includes a full texmf tree, many programs like tex, \
dvips, etc., shell script configuration, and a big collection of \
documentations. This package is easily configured by the script \
texconfig and has multilanguage options."
LICENSE = "Apache-2.0 & Artistic-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LPPL-1.3c & LPPL-1.0 & MIT & BSD-3-Clause & SUSE-TeX & LicenseRef-SUSE-Public-Domain"

PV = "2026.20260301"

RPM_NAME = "texlive-2026.20260301-120.4.aarch64.rpm"
RPM_HASH = "9ac94f7d1d753dae83227d07502897f96f0c652b237b94063be693ddbd6047d9d550a7cf876428a1219b49e2ed9fab263789ecdc129e8c35c41b974f9fba9593"

RPROVIDES:${PN} += "texlive"

RDEPENDS:${PN} += "/usr/bin/clear \
/usr/bin/dialog \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
group-mktex \
sed \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
user-mktex"

inherit rpm
