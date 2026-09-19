SUMMARY = "Mustache for Python"
DESCRIPTION = "Pystache is a Python implementation of Mustache. Mustache is a \
framework-agnostic, logic-free templating system inspired by \
ctemplate and etc. Like ctemplate, Mustache 'emphasises separating \
logic from presentation: it is impossible to embed application \
logic in this template language.' \
 \
The mustache(5) man page provides a good introduction to Mustache's \
syntax. For a more complete (and more current) description of \
Mustache's behaviour, see the official Mustache spec: \
https://github.com/mustache/spec."
LICENSE = "MIT"

PV = "0.6.8"

RPM_NAME = "python313-pystache-0.6.8-1.8.noarch.rpm"
RPM_HASH = "5012d9cc222a2be5aa500240b8dab3cce3708a0e261cac6a03731671617b992356f99d62cd01521be0dc6f8549a52c21b1b38c39887f4cda178bc6eccdd2bd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pystache \
python3.13dist-pystache \
python313-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
