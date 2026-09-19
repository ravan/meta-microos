SUMMARY = "LaTeX code and documentation in LaTeX-format file"
DESCRIPTION = "The CodeDoc class is an alternative to DocStrip (and others) to \
produce LaTeX code along with its documentation without \
departing from LaTeX's ordinary syntax. The documentation is \
prepared like any other LaTeX document and the code to be \
commented verbatim is simply delimited by an environment. When \
an option is turned on in the class options, this code is \
written to the desired file(s). The class also includes fully \
customizable verbatim environments which provide the author \
with separate commands to typeset the material and/or to \
execute it."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-2026.226.0.0.3svn17630-60.2.noarch.rpm"
RPM_HASH = "4ab1d0c85eb789b832c0479672330bf0d1c477ae1ece232c2b2b40c4b5815d2ab998db384db201fc09fd82f3dd30a4cc4ac42a7559f064fd56e1f41e2bbe366f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codedoc.cls \
texlive-codedoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
