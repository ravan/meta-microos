SUMMARY = "Left sub- and superscripts in maths mode"
DESCRIPTION = "The package enables left subscripts and superscripts in maths \
mode. The sub- and superscripts are raised for optimum fitting \
to the symbol indexed, in such a way that left and right sub- \
and superscripts are set on the same level, as appropriate. The \
package provides an alternative to the use of the \\sideset \
command in the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-fouridx-2026.226.2.00svn77682-60.2.noarch.rpm"
RPM_HASH = "1d7c3849e2ffedaac49c8f888e3994b8af763a79701cf6a0eb8a0ac01184a716d8c824226809e22691b1ee14cbfb2feafe8e03b498c5ba5338aa2905439305e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fouridx.sty \
texlive-fouridx"

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
