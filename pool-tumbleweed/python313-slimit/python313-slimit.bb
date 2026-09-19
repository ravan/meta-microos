SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python313-slimit-0.8.1-13.7.noarch.rpm"
RPM_HASH = "de454ab2c90d948d3a4580a08682dd798e39b7842e52a6854102d94c3bbafad32549244af7748761b3839a5bb8f74d18bdb47da5dd9901270c77c770ad6a3c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slimit \
python3.13dist-slimit \
python313-slimit \
python3dist-slimit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-ply \
update-alternatives"

inherit rpm
