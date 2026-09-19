SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-doc-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "e12e96afd1fc5f5e9fa43d847f75f7cfbe756e7f11ad81357fd28ae7938f9d0eed69e19f335f924c1f83d89300d59ab03292af2ae41dd5cb770a110cc052f645"

RPROVIDES:${PN} += "python310-doc"

RDEPENDS:${PN} += ""

inherit rpm
