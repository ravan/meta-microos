SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-doc-devhelp-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "75a8b0658ae35c8751a767c31da69a5b16b282eb0a71917288508fff175f1fe6ab2cf4a88b9d19aa4dd0431d375069d3f19c7ab9e32bf5036500afc512948d13"

RPROVIDES:${PN} += "python314-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
