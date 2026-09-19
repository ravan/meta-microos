SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-doc-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "6570920aef43a7619f77434892750e798c15cb95e4e508d2298b11244e501e607401876dad70c9e267b8875646d56ff60c653e9926019705cb618d9e07a12102"

RPROVIDES:${PN} += "python3-doc \
python313-doc"

RDEPENDS:${PN} += ""

inherit rpm
