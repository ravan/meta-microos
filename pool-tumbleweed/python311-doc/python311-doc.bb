SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-doc-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "c9cd1a8dbeb3df46c9c47c287708f40c9ea4d618801d0fb0c7c5e4cbecefcf7af0797480637775dc74b7cdc3c6f8acbbcd7712deb9d72a8f25b00fbc00641d4b"

RPROVIDES:${PN} += "python311-doc"

RDEPENDS:${PN} += ""

inherit rpm
