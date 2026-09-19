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

RPM_NAME = "python313-json5-0.15.0-1.2.noarch.rpm"
RPM_HASH = "f361272301a810e01ff0b6ff1c543a07a43678ba5b3cc81332ff90b32d9cc798fb7873aa3c25760d3c516ed91ba6f525465fa6b190458d746fc6ec2d5a7624a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json5 \
python3.13dist-json5 \
python313-json5 \
python3dist-json5"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
