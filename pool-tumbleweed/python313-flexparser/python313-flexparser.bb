SUMMARY = "Parsing made fun ... using typing"
DESCRIPTION = "Parsing made fun ... using typing."
LICENSE = "BSD-3-Clause"

PV = "0.4"

RPM_NAME = "python313-flexparser-0.4-1.9.noarch.rpm"
RPM_HASH = "0cfc0a8ad178bb9d089fd76b16d86c24ec0d47af12361f119dd83eaf4d099b956add72b8dc9c05168516e0dbdee65ea928b9f02d0b815e7a8a572818140613e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexparser \
python3.13dist-flexparser \
python313-flexparser \
python3dist-flexparser"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
