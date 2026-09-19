SUMMARY = "Count source lines of code (SLOC) using pygments"
DESCRIPTION = "Pygount is a command line tool to scan folders for source code files and \
count the number of source code lines in it. It is similar to tools like \
[sloccount](https://www.dwheeler.com/sloccount/) and \
[cloc](https://github.com/AlDanial/cloc) but uses the \
[pygments](https://pygments.org/) \
package to analyze the source code and consequently can analyze any \
[programming language supported by pygments](https://pygments.org/languages/). \
 \
The name is a combination of pygments and count."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python314-pygount-3.2.0-1.1.noarch.rpm"
RPM_HASH = "2027a7422b4e369f686693aaaf97430703edf920fe8e3b3ce33a3e12869a4b54a1a1d03ca2c629dd60d1c2f0913b474ac509d469289b75e00a933ebc15a0f2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygount \
python314-pygount \
python3dist-pygount"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-GitPython \
python314-chardet \
python314-pygments \
python314-rich \
update-alternatives"

inherit rpm
