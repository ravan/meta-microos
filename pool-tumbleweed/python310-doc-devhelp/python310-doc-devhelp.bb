SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-doc-devhelp-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "8c99def4a11ec0ea27d64b497c74fcc4deec1c8185bfdadf06a098bb4ce25249c3f4c7c7679f0a589373e1fad4bc25cf585b6fb8e6c9e11372f13991a99eff73"

RPROVIDES:${PN} += "python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
