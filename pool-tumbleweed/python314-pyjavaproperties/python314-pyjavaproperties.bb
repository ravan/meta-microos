SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python314-pyjavaproperties-0.7-3.5.noarch.rpm"
RPM_HASH = "ca1ccee2e357a1fad81977ae18147c7041b675e1a947285f88d6bd40af873da87ce7e8aabf402dd925b93e81f5026f65d5ef04965adf49dd79efee183a5d0d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyjavaproperties \
python314-pyjavaproperties \
python3dist-pyjavaproperties"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
