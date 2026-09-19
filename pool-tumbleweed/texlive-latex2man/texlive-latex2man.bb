SUMMARY = "Translate LaTeX-based manual pages into Unix man format"
DESCRIPTION = "Latex2man is a tool to translate UNIX manual pages written with \
LaTeX into the troff format understood by the UNIX man(1) \
command. Alternatively HTML, Texinfo, or LaTeX code can be \
produced too. Output of parts of the text may be suppressed \
using the conditional text feature (for this, LaTeX generation \
may be used). There is a LaTeX package (latex2man.sty) for \
writing the man page and a Perl script (latex2man) that does \
the actual translation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn77377"

RPM_NAME = "texlive-latex2man-2026.226.1.30svn77377-61.2.noarch.rpm"
RPM_HASH = "dd65ccdd83084ac712de97b16ae76feb781e4947d2764aef1a36b6ed4688e3856dd3e5f65c8d879f90a578010a690df5ba7e34d0ae712a10b9c5e2fb7924dafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex2man.cfg \
tex-latex2man.sty \
texlive-latex2man"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Getopt--Std \
sed \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2man-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
