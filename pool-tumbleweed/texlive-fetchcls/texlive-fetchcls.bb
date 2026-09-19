SUMMARY = "Fetch the current class name"
DESCRIPTION = "With standard LaTeX you are able to check for the class in use \
invoking the kernel command \\@ifclassloaded. However, doing so \
you cannot get the explicit class name, unless you want to loop \
over every possible class name until \\@ifclassloaded returns \
true -- don't do that! With the help of the present package you \
can obtain the name of the current class with significantly \
less effort. Just load the package as usual: \
\\usepackage{fetchcls}; then, the control sequence \\classname \
will hold the name you were looking for."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45245"

RPM_NAME = "texlive-fetchcls-2026.226.1.0svn45245-59.2.noarch.rpm"
RPM_HASH = "df5971d45cd0771db019f137fe0410e133611efdabf628d6648233133818c6d7079ac29a81f454b9e67565446995314f8771eedbad627c0561a3034fe91369f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fetchcls.sty \
texlive-fetchcls"

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
