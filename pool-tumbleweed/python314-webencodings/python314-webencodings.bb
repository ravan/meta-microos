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

RPM_NAME = "python314-webencodings-0.5.1-6.5.noarch.rpm"
RPM_HASH = "11b5af2f1fce5245e591acc7dec117c7d958d2bfee8797e6bb84bbc63d2bf3219315f5eea08798558f4ea5f936717d8cf503ff478eb0ae60400ff3fb9e638009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webencodings \
python314-webencodings \
python3dist-webencodings"

RDEPENDS:${PN} += "python-abi"

inherit rpm
