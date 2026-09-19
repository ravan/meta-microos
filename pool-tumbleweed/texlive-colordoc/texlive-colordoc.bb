SUMMARY = "Coloured syntax highlights in documentation"
DESCRIPTION = "The package is used in documentation files (that use the doc \
package); with it the code listings will highlight (for \
example) pairs of curly braces with matching colors. Other \
delimiters like \\if ... \\fi, are highlighted, as are the names \
of new commands. All this makes code a little more readable, \
and helps during process of writing. Three options are \
provided, including a non-color option designed for printing \
(which numbers delimiters and underlines new commands)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18270"

RPM_NAME = "texlive-colordoc-2026.226.svn18270-60.2.noarch.rpm"
RPM_HASH = "1bb9f522c7480a112d69321ae6d676abdcefd4371fdbce3344108a5180b97132fc8aa1a3060033dc12ef92c855ec3611e31cac733d42d07ae8288c1a3f9e5361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colordoc.sty \
texlive-colordoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fixltx2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
