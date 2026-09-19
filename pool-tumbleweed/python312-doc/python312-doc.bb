SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-doc-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "5404f9d581d5553121567b15b9d4867f89122e16f8ad1f70217b46cbb9e2bec14f85935b4c4fc1b50469ca01bf079343379414393ead24b218f8205d84d8c932"

RPROVIDES:${PN} += "python312-doc"

RDEPENDS:${PN} += ""

inherit rpm
