SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-doc-devhelp-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "36c137fc76d5462314f2a30c97c0e3e75ead428c003ae9fc1cb848b36620f1e2728b44ae97854acce55c7b062750bdf1c1bb601b8c315bbe577bfa43417b7103"

RPROVIDES:${PN} += "python3-doc-devhelp \
python313-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
