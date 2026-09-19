SUMMARY = "Parsing made fun ... using typing"
DESCRIPTION = "Parsing made fun ... using typing."
LICENSE = "BSD-3-Clause"

PV = "0.4"

RPM_NAME = "python314-flexparser-0.4-1.9.noarch.rpm"
RPM_HASH = "9b96988660e82115650ba75c402fac90b7d8dc608350f7d568ef6fc1ee8b76b00cca516e0e279384abdc4fa54faca1af4adeda57b526738e22d36b64606917d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flexparser \
python314-flexparser \
python3dist-flexparser"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
