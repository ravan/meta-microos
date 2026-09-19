SUMMARY = "Library to run Python code"
DESCRIPTION = "Just like PerlTeX or PyLuaTeX (and unlike PythonTeX or \
lt3luabridge), this only requires a single run, and variables \
are persistent throughout the run. Unlike PerlTeX or PyLuaTeX, \
there is no restriction on compiler or script required to run \
the code. There are also debugging functionalities: TeX errors \
result in Python traceback, and Python errors result in TeX \
traceback. Errors in code executed with the pycode environment \
give the correct traceback point to the Python line of code in \
the TeX file. For advanced users, this package allows the user \
to manipulate the TeX state directly from within Python, so you \
don't need to write a single line of TeX code. CAUTION: In \
addition to this LaTeX package you need the Python \
pythonimmediate-tex package, which can be obtained from \
https://pypi.org/project/pythonimmediate-tex/."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn76924"

RPM_NAME = "texlive-pythonimmediate-2026.226.0.0.6.0svn76924-60.4.noarch.rpm"
RPM_HASH = "b413ae2741bc3c65d28ad9df65844915df42984d8fc564c0edff1dd18d30cebf34a8d2ac12600fb3145c6b7ea9d6c998a5ca8495b74b3054eace634bee9bbb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonimmediate.sty \
texlive-pythonimmediate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-l3keys2e.sty \
tex-precattl.sty \
tex-saveenv.sty \
texlive \
texlive-currfile \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-precattl \
texlive-saveenv \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
