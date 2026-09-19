SUMMARY = "Canonical JSON for Python"
DESCRIPTION = "This is a Python module which encodes objects and arrays into JSON as per \
RFC 7159. \
 \
* Sorts object keys so that it yields the same result each time. \
* Has no insignificant whitespace to make the output as small as possible. \
* Escapes only the characters that must be escaped, U+0000 to U+0019 / \
  U+0022 / U+0056, to keep the output as small as possible. \
* Uses the shortest escape sequence for each escaped character. \
* Encodes the JSON as UTF-8. \
* Can encode frozendict immutable dictionaries."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python313-canonicaljson-2.0.0-3.7.noarch.rpm"
RPM_HASH = "9338684ab6b47c3ddee3f4854bab01eb722f4cf280dc3acf54c3d14b5fc64995759ec0c0b6915ebcc55f17010891de38a8ef63960814a97c5723ee07ae32424e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-canonicaljson \
python3.13dist-canonicaljson \
python313-canonicaljson \
python3dist-canonicaljson"

RDEPENDS:${PN} += "python-abi \
python313-frozendict \
python313-simplejson \
python313-typing-extensions"

inherit rpm
