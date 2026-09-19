SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "4.6.0"

RPM_NAME = "python314-Chameleon-4.6.0-2.5.noarch.rpm"
RPM_HASH = "1b690a7028c579eb2069200ef56b1e70a30487e11ad00f0575ac7731750426c46c12cb3bac43d45b4c00e6de8ef6959cfa72cedb676536d46824411b7d3ecb51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-chameleon \
python314-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
