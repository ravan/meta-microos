SUMMARY = "JavaScript minifier written in Python"
DESCRIPTION = "SlimIt is a JavaScript minifier written in Python. It compiles \
JavaScript into more compact code so that it downloads and runs \
faster. \
 \
SlimIt also provides a library that includes a JavaScript parser, \
lexer, pretty printer and a tree visitor."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-slimit-0.8.1-13.7.noarch.rpm"
RPM_HASH = "daad00ee6fa03ad6c97875e9e1bb7feb3d75bd308f560fead0c2da8ca5b79c8580f7155f2d89dc147cfb1592a8792e3c6fda1aafffd645c8af1a155c04e36a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-slimit \
python314-slimit \
python3dist-slimit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-ply \
update-alternatives"

inherit rpm
