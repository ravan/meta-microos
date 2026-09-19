SUMMARY = "A schema-based serialization and deserialization library"
DESCRIPTION = "An extensible package which can be used to: \
 \
- deserialize and validate a data structure composed of strings, \
  mappings, and lists. \
 \
- serialize an arbitrary data structure to a data structure composed \
  of strings, mappings, and lists."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0"

RPM_NAME = "python314-colander-2.0-2.5.noarch.rpm"
RPM_HASH = "0603eb3c7ee8b28dcb20b43a6845f6b06790466cac7af8187b17276c6693e524333a2e13c4e8b59c60cdddd6dbca645b97ca98ff0b0100c37245fe115e8d3aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colander \
python314-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python314-iso8601 \
python314-translationstring"

inherit rpm
