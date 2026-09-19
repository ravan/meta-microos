SUMMARY = "Character encoding aliases for legacy web content"
DESCRIPTION = "This is a Python implementation of the WHATWG Encoding standard. \
 \
In order to be compatible with legacy web content when interpreting \
something like Content-Type: text/html; charset=latin1, tools need to \
use a particular set of aliases for encoding labels as well as some \
overriding rules. For example, US-ASCII and iso-8859-1 on the web are \
actually aliases for windows-1252, and an UTF-8 or UTF-16 BOM takes \
precedence over any other encoding declaration. The Encoding standard \
defines all such details so that implementations do not have to \
reverse-engineer each other. \
 \
This module has encoding labels and BOM detection, but the actual \
implementation for encoders and decoders is Python’s."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python313-webencodings-0.5.1-6.5.noarch.rpm"
RPM_HASH = "1680ec09ed25668a4085d178f15c9c9d96c72bed67c3f87ecea47fdfbb0b1f1a84da6d8b4ab6d1d3aedcf01ef710d14866a09cfc3aa2dfaf30f4c5d99deb7da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webencodings \
python3.13dist-webencodings \
python313-webencodings \
python3dist-webencodings"

RDEPENDS:${PN} += "python-abi"

inherit rpm
