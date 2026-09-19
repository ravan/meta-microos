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

RPM_NAME = "python314-pystache-0.6.8-1.8.noarch.rpm"
RPM_HASH = "93a5e47bc369d17451b84dfff6cd4de9c7820bacb4973053decf6eabfabbbe3e0b37d58034ea1a0c154ed95ce74e157edbe6b5bd4826322ae631d5ce6e277543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pystache \
python314-pystache \
python3dist-pystache"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
