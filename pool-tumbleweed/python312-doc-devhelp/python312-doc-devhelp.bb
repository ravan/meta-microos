SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-doc-devhelp-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "ff44900bf230a44795a82a50b7139e35e0fff55e4839c94776fef1441ed84fe5dd43849820778dec4704fec8c1b4028c19672731f5f740e95ed53a71b700830e"

RPROVIDES:${PN} += "python312-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
