SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "8.0.6"

RPM_NAME = "python314-pydash-8.0.6-2.2.noarch.rpm"
RPM_HASH = "49d65f982a041fef662082e63771716e9a86133cc0763a1ec2ff8e9f0e31fc4dd51f89ed258d971f388efcc3ee4ce593595267ee906a3f362992c1a95fb129a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydash \
python314-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
