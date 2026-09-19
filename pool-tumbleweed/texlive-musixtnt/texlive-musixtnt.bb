SUMMARY = "A MusiXTeX extension library that enables transformations of the effect of notes commands"
DESCRIPTION = "The package includes an archive containing a MusiXTeX extension \
library musixtnt and C source code, binaries for Windows (32 \
bit and 64 bit) and MacOSX, and documentation for two programs: \
fixmsxpart and msxlint. musixtnt.tex provides a macro \
\\TransformNotes that enables transformations of the effect of \
notes commands such as \\notes. In general, the effect of \
\\TransformNotes{input}{output} is that notes commands in the \
source will expect their arguments to match the input pattern, \
but the notes will be typeset according to the output pattern. \
An example is extracting single-instrument parts from a \
multi-instrument score. fixmsxpart corrects note spacing in a \
single-part MusiXTeX source (possibly derived from a \
multi-instrument score and as a result having irregular note \
spacing). msxlint detects incorrectly formatted notes lines in \
a MusiXTeX source file. This should be used before using \
\\TransformNotes."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn69742"

RPM_NAME = "texlive-musixtnt-2026.226.svn69742-61.2.noarch.rpm"
RPM_HASH = "96a984ee3d5cdf3e7fe7322615d7b45a0658dfaf32ae09192ad171b43625a63749176484b9de09bd6e90ba297d7794c7c32db888b7668013542866c90d948e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musixtnt.tex \
texlive-musixtnt"

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
texlive-musixtex \
texlive-musixtnt-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
