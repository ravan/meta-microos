SUMMARY = "A Python implementation of the JSON5 data format"
DESCRIPTION = "A Python implementation of the JSON5 data format. \
 \
JSON5 extends the JSON data interchange format to make it \
slightly more usable as a configuration language: \
 \
  * JavaScript-style comments (both single and multi-line) are legal. \
  * Object keys may be unquoted if they are legal ECMAScript identifiers \
  * Objects and arrays may end with trailing commas. \
  * Strings can be single-quoted, and multi-line string literals are allowed."
LICENSE = "Apache-2.0"

PV = "0.15.0"

RPM_NAME = "python314-json5-0.15.0-1.2.noarch.rpm"
RPM_HASH = "7536b0d905a1e685af7a3332bb332d4353454b9b57ff615d068cff1bacc4cdce9e1da7fb7d924fa68ad4facd75896284c3b1d8ae86fa2ea37bcfc2039f2cd8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-json5 \
python314-json5 \
python3dist-json5"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
