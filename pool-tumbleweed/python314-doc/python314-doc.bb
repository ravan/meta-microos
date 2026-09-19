SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-doc-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "cdd2ccefa2643253dacc581aaf7ceab45528c4d5e19e7599bedbb090ee1efba701937fe081117bc553393b2913d5a5cdbe2eb212082381eaa2d84abaad88ff14"

RPROVIDES:${PN} += "python314-doc"

RDEPENDS:${PN} += ""

inherit rpm
