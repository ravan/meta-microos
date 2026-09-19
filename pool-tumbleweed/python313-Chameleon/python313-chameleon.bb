SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "4.6.0"

RPM_NAME = "python313-Chameleon-4.6.0-2.5.noarch.rpm"
RPM_HASH = "8b0dbdd24fa03ba538fdbe2b17f8868de223ec23d5b01d445a0560ee0f2483e9206542692eda84280d4506fdde2fc385cc626a4709edaf7ccdab16ad342f3cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Chameleon \
python3.13dist-chameleon \
python313-Chameleon \
python3dist-chameleon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
