SUMMARY = "Babel support for Hebrew"
DESCRIPTION = "The package provides the language definition file for support \
of Hebrew in babel. Macros to control the use of text direction \
control of TeX--XeT and e-TeX are provided (and may be used \
elsewhere). Some shortcuts are defined, as well as translations \
to Hebrew of standard 'LaTeX names'. For questions, bug \
reports, or support, please open an issue in the repository. \
Note: the package is in maintenance mode. Bugs will be fixed, \
but no new features will be added. The .ldf file is only \
compatible with pdfLaTeX or LaTeX. Even then, for documents \
containing more than a short text in Hebrew, it is strongly \
recommended to use LuaTeX (with babel's .ini file or \
polyglossia). For short texts with pdfTeX, use the .ini file. \
Consult the documentation of babel for better settings for \
Hebrew."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77914"

RPM_NAME = "texlive-babel-hebrew-2026.226.2.5svn77914-60.2.noarch.rpm"
RPM_HASH = "77cfcada3b02aac6b733865f307d7fb9e476091877b30df9daaa4aeaecd2836a394a6107cdb5d0e7ac7077b914c878f063652fbb9e89072abbe08360b9ea5e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hebcal.sty \
tex-hebrew-newcode.sty \
tex-hebrew-oldcode.sty \
tex-hebrew-p.sty \
tex-hebrew.ldf \
tex-rlbabel.def \
texlive-babel-hebrew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
