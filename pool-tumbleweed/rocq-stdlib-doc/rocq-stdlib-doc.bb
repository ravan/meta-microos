SUMMARY = "Documentation for the Rocq standard library"
DESCRIPTION = "HTML reference manual for the Rocq standard library."
LICENSE = "OPUBL-1.0"

PV = "9.2.0"

RPM_NAME = "rocq-stdlib-doc-9.2.0-1.1.noarch.rpm"
RPM_HASH = "beecd202e4f8927390df0b7ace4e7c3b75f110de1b9d17c6b138a537188a46580cbc5b64519284bd4af45cb71829cccfc80c52c678531cec415a49e1604aafba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc-/usr/share/doc/packages/coq/stdlib/index.html \
rocq-stdlib-doc"

RDEPENDS:${PN} += "rocq-stdlib"

inherit rpm
