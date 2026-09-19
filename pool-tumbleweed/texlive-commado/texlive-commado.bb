SUMMARY = "Expandable iteration on comma-separated and filename lists"
DESCRIPTION = "The bundle provides two packages: commado and filesdo. The \
package commado provides the command \\DoWithCSL: \
\\DoWithCSL{<cmd>}{<list>} applies an existing one-parameter \
macro <cmd> to each item in a list <list> in which terms are \
separated by commas. The package filesdo provides the command \
\\DoWithBasesExts: \\DoWithBasesExts{<cmd>}{<bases>}{<exts>} \
which runs the single parameter command <cmd> on each file \
whose base and extension are respectively from the \
comma-separated lists <bases> and <exts>. These 'loop'-like \
commands are (themselves) entirely expandable. The packages \
rely on packages plainpkg, and stacklet"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.11asvn38875"

RPM_NAME = "texlive-commado-2026.226.r0.11asvn38875-60.2.noarch.rpm"
RPM_HASH = "7e0325ddffcd690548208620b7b99b67443ad86cff7825c814c14df723bd92d141f6ffc56268ce3614255ccef283e780d46356e15a38168e6378a6b8e9a1e913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commado.sty \
tex-filesdo.sty \
texlive-commado"

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
