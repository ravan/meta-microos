SUMMARY = "String manipulation for (La)TeX"
DESCRIPTION = "The package provides macros for manipulating strings -- testing \
a string's contents, extracting substrings, substitution of \
substrings and providing numbers such as string length, \
position of, or number of recurrences of, a substring. The \
package works equally in Plain TeX and LaTeX (though e-TeX is \
always required). The strings to be processed may contain \
(expandable) macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.86svn77682"

RPM_NAME = "texlive-xstring-2026.226.1.86svn77682-59.4.noarch.rpm"
RPM_HASH = "a826e59857b6fbab4b99cde2fd0857f253bbb6b2ea72a82e130b455eb11dc76b163b03fb28ff7240175212dba9cce1f4eab6b5806e44ebf4c4330a8cc834825c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xstring.sty \
tex-xstring.tex \
texlive-xstring"

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
