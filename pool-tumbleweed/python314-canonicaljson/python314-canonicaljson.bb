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

RPM_NAME = "python314-canonicaljson-2.0.0-3.7.noarch.rpm"
RPM_HASH = "76b620ded3ca7b0bbf6a776d6e10e7b7563633df3346aa0a0345c8ab76743fb7a79e432d1edb6b1d8906b8e9fb83e5484b3e062043a17df6d166fc4e4a23e886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-canonicaljson \
python314-canonicaljson \
python3dist-canonicaljson"

RDEPENDS:${PN} += "python-abi \
python314-frozendict \
python314-simplejson \
python314-typing-extensions"

inherit rpm
