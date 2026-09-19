SUMMARY = "More enumeration options"
DESCRIPTION = "The package provides the following new enumerate styles: \\greek \
for lowercase Greek letters; \\Greek for uppercase Greek \
letters; \\enumHex for uppercase hexadecimal enumeration; \
\\enumhex for lowercase hexadecimal enumeration; \\enumbinary for \
binary enumeration; \\enumoctal for octal enumeration; \\levelnth \
for '1st', '2nd', '3rd' etc., with the 'nth's on the baseline; \
raisenth for '1st', '2nd', '3rd' etc., with the 'nth's raised; \
\\nthwords for 'first', 'second', 'third' etc.; \\Nthwords for \
'First', 'Second', 'Third' etc.; \\NTHWORDS for 'FIRST', \
'SECOND', 'THIRD' etc.; \\nwords for 'one', 'two', 'three' etc.; \
\\Nwords for 'One', 'Two', 'Three' etc.; and \\NWORDS for 'ONE', \
'TWO', 'THREE' etc. Each of these works with enumitem's \
'starred variant' feature. So \
\\begin{enumerate}[label=\\enumhex*] will output a hex enumerated \
list. Enumitem provides a start=0 option for starting your \
enumerations at 0. The package requires amsmath, alphalph, \
enumitem (of course), binhex and nth, all of which are widely \
available."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-moreenum-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "9acc527d9a97a8fb050729b39b4be4013b626f6b492f9075f93de5c4e4c0bdce91a09c664b30be119c6daa5d9c267b45903d2bc6aa4acc1d18e4b529f5b65a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moreenum.sty \
texlive-moreenum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-amsmath.sty \
tex-enumitem.sty \
tex-fmtcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
