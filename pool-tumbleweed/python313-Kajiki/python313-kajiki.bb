SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-Kajiki-1.0.2-1.3.noarch.rpm"
RPM_HASH = "cecf1e900f7b57960a6986a4ed22f5b8c18f955f8798ec846a01f1802aeed0050dd7ea6b0b4dd9b77047aede1ee8a23bce46c36d17285a4038dd480f2502e466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Kajiki \
python3.13dist-kajiki \
python313-Kajiki \
python3dist-kajiki"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-linetable \
update-alternatives"

inherit rpm
