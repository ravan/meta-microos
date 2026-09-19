SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-doc-devhelp-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "545bbe0dacf14e6c290f78aae5ce2294ed29a8d06a98ee699fd1a920d20c89d4337c43e2c411287f94017cd50d28bebfd235efdfa2b877d6d4defb2b5604f280"

RPROVIDES:${PN} += "python315-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
