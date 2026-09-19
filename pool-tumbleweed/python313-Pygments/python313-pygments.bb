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

RPM_NAME = "python313-Pygments-2.21.0-1.1.noarch.rpm"
RPM_HASH = "386a392f1b0b95928d9b856f24c0cfb6161959f351dfd40d467cd7dd384f9552dbd28ca899ac251f3909197a803df440de0c1d46221ab33cccda070e8b6c2880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pygments \
python3-pygments \
python3.13dist-pygments \
python313-Pygments \
python313-pygments \
python3dist-pygments"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
