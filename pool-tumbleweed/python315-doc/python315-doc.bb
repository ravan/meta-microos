SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-doc-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "445932790ab5b60f8cc5683c9c8eb6aa55ccc07ad0fa4ed1d3a5f529999142815f7106780fc6ff02e0b782a6a5825434b08b44d97f48eea1770558b856d0b1a3"

RPROVIDES:${PN} += "python315-doc"

RDEPENDS:${PN} += ""

inherit rpm
