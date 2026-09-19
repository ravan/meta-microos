SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-adapt-parser-1.0.0-4.5.noarch.rpm"
RPM_HASH = "c818cfb3b62aabdd00c7b06de8dc5d46e6e380f676c3fbe492e0a5c91bacffa01ac11af9b8febb424eea69efa07e73d69e83902fb40532dfd745d90459aab675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-adapt-parser \
python314-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
