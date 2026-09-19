SUMMARY = "Describe additional object types in dtx source files"
DESCRIPTION = "The doc package includes tools for describing macros and \
environments in LaTeX source .dtx format. The dtxdescribe \
package adds additional tools for describing booleans, lengths, \
counters, hooks, sockets, plug, keys, packages, classes, \
options, files, commands, arguments, and other objects, and \
also works with the standard document classes as well, for \
those who do not wish to use the .dtx format. Each item is \
given a margin tag similar to \\DescribeEnv, and is listed in \
the index by itself and also by category. Each item may be \
sorted further by an optional class. All index entries except \
code lines are hyperlinked. The dtxexample environment is \
provided for typesetting example code and its results. Contents \
are displayed verbatim along with a caption and \
cross-referencing. They are then input and executed, and the \
result is shown. Environments are also provided for displaying \
verbatim or formatted source code, user-interface displays, and \
sidebars with titles. Macros are provided for formatting the \
names of inline LaTeX objects such as packages and booleans, as \
well as program and file names, file types, internet objects, \
the names of certain programs, a number of logos, and inline \
dashes and slashes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.09svn69507"

RPM_NAME = "texlive-dtxdescribe-2026.226.1.09svn69507-59.2.noarch.rpm"
RPM_HASH = "02f548f431b8b2d5816ee59fb2cb9d650b31663c255e5899a4457eda9a5a3c9ac5d046fe4d99e005a72681f8fbdc9b51917cc9515e16e6cae37eefa201aa0f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtxdescribe.sty \
texlive-dtxdescribe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-caption.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-makeidx.sty \
tex-newfloat.sty \
tex-pict2e.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
