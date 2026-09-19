SUMMARY = "Format mathematical intervals, ensuring proper spacing"
DESCRIPTION = "When typing an open interval as $]a,b[$, a closing bracket is \
being used in place of an opening fence and vice versa. This \
leads to the wrong spacing in, say, $]-a,b[$ or $A\\in]a,b[=B$. \
The package attempts to solve this using: \\interval{a}{b} -> \
[a,b] \\interval[open]{a}{b} -> ]a,b[ \\interval[open left]{a}{b} \
-> ]a,b] The package also supports fence scaling and ensures \
that the enclosing fences will end up having the proper closing \
and opening types. TeX maths does not do this job properly. The \
package depends on pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-interval-2026.226.0.0.4svn77682-60.2.noarch.rpm"
RPM_HASH = "eaeefbe9a8a3ecbd91c1db42f493a60c0f79a8ff6cdd97f37a692edc72afb254536002788eaca2472567e453b9ad153dbc2bf49e6fc70b58732e871f927fed6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interval.sty \
texlive-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
