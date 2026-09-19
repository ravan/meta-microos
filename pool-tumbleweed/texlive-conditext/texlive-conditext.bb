SUMMARY = "Define and manage conditional content"
DESCRIPTION = "This package provides some commands to define and manage \
conditional content in a LaTeX source document. A conditional \
content, in the sense within this is understood in this \
package, is a text (including mathematical or other formulas) \
and/or a graphical element (diagram, figure, image...) as \
substitutable forms, which, according to a condition test, may \
or may not appear in the generated document. One of the most \
common forms of conditional content management is multilingual \
; but it can also include versioning, confidentiality levels, \
and so on. The philosophy of this package is based on the \
respective notions of condition field, condition property and \
condition space. With this package, any substitutable form in a \
source document is identified by a condition field and a \
condition property. The condition field is a functional theme \
that allows you to group together substitutable forms for the \
same conditional management. The condition property is a \
functional characterization specific to each substitutable form \
of a single condition domain. The condition space is used to \
designate the substitutable form(s) that must appear in the \
generated document. A condition space is defined by specifying \
a condition domain and a condition property to match with one \
or more substitutable forms."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn55387"

RPM_NAME = "texlive-conditext-2026.226.1.5svn55387-60.2.noarch.rpm"
RPM_HASH = "4e1944f890d2bb215f29235d634cec75f26f0b47dada17619409dd78f512abe4a768caa6a8fba1b5d6cb3548be4dcfd81eba5a115b34b568fb04cdf05044eb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CondiTeXt.sty \
texlive-conditext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
