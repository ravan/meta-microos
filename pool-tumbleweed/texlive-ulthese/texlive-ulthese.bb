SUMMARY = "Thesis class and templates for Universite Laval"
DESCRIPTION = "The package provides a class based on memoir to prepare theses \
and memoirs compliant with the presentation rules set forth by \
the Faculty of Graduate Studies of Universite Laval, Quebec, \
Canada. The class also comes with an extensive set of templates \
for the various types of theses and memoirs offered at Laval. \
Please note that the documentation for the class and the \
comments in the templates are all written in French, the \
language of the target audience."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0svn77089"

RPM_NAME = "texlive-ulthese-2026.226.7.0svn77089-60.2.noarch.rpm"
RPM_HASH = "bb459221cc2e1a667f04fd5f99a6e36c60da1e46f511e1ac4f8054f17ff78df2360491b6fc8f48b8dc7f9af0323da937cb66d435b94a3fc55404431e4c2caa60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulthese.cls \
texlive-ulthese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-natbib.sty \
tex-numprint.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
