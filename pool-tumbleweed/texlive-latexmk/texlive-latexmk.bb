SUMMARY = "Fully automated LaTeX document generation"
DESCRIPTION = "Latexmk completely automates the process of generating a LaTeX \
document. Given the source files for a document, latexmk issues \
the appropriate sequence of commands to generate a .dvi, .ps, \
.pdf or hardcopy version of the document. An important feature \
is the 'preview continuous mode', where the script watches all \
of the source files (primary file and included TeX and graphics \
files), and reruns LaTeX, etc., whenever a source file has \
changed. Thus a previewer can offer a display of the document's \
latest state."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.87svn75540"

RPM_NAME = "texlive-latexmk-2026.226.4.87svn75540-61.2.noarch.rpm"
RPM_HASH = "787d20af95b14774326497cc1966965ca10d7bd418c9971cd6cb19276c8e37cf708346669c43dd07d2a4e06e248b6573b9754a6734f153fc78dac236f0c6ee3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-latexmk \
texlive-latexmk"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-Cwd \
perl-Digest--MD5 \
perl-Encode \
perl-File--Basename \
perl-File--Copy \
perl-File--Find \
perl-File--Glob \
perl-File--Path \
perl-File--Spec--Functions \
perl-FileHandle \
perl-List--Util \
perl-Time--HiRes \
perl-Unicode--Normalize \
perl-feature \
perl-sigtrap \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexmk-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
