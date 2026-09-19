SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-Kajiki-1.0.2-1.3.noarch.rpm"
RPM_HASH = "8619264c342b2107c8ff5d2a9d6f6e5fd7027762f2ba319b06a31b815cbf342666ac2c1b3e718e62bd9039c1d0dd8b1638eb660280bcaff33287b631ce950f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kajiki \
python314-Kajiki \
python3dist-kajiki"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-linetable \
update-alternatives"

inherit rpm
