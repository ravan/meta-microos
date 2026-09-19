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

RPM_NAME = "python313-pygount-3.2.0-1.1.noarch.rpm"
RPM_HASH = "251479929b2bd763fd90f84dfac4795716e069c79bb9fb47ac8e7df3125597e3fc19752a42fcfb83e7cfca39ee1a71e9e4099bb85128d10d34ce32e1fa29a419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygount \
python3.13dist-pygount \
python313-pygount \
python3dist-pygount"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-GitPython \
python313-chardet \
python313-pygments \
python313-rich \
update-alternatives"

inherit rpm
