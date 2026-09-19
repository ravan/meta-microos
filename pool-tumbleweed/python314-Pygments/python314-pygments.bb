SUMMARY = "A syntax highlighting package written in Python"
DESCRIPTION = "Pygments is a generic syntax highlighter for general use in all kinds of software \
such as forum systems, wikis or other applications that need to prettify \
source code. Highlights are: \
 \
 * a wide range of common languages and markup formats is supported \
 * support for new languages and formats can be added \
 * a number of output formats, presently HTML, LaTeX, RTF, SVG, all image \
   formats that PIL supports and ANSI sequences \
 * it is usable as a command-line tool and as a library \
 * highlights Brainfuck"
LICENSE = "BSD-2-Clause"

PV = "2.21.0"

RPM_NAME = "python314-Pygments-2.21.0-1.1.noarch.rpm"
RPM_HASH = "28d1e964afa7d6df57fe81b674b4e82a219c3d490354cac9edbe576ee5fc803bdeadda0cd3db9777e053956ffdc90ded13aae7164c72fb2db022ebaa9444e65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygments \
python314-Pygments \
python314-pygments \
python3dist-pygments"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
