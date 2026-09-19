SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-doc-devhelp-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "429502a2a17c7ede50ffb6934283adc94c321cdeb24bb73a8c007c18b58789563e755400aa0d8eb3263f9b899a78f22caa64acecd794eea584ecfcec285577b4"

RPROVIDES:${PN} += "python311-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
