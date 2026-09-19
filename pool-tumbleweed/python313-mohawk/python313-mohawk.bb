SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python313-mohawk-1.1.0-6.5.noarch.rpm"
RPM_HASH = "3814f4f63de81025e814063c9de45f466ca38648debf5110b962b6ab1b76a6d6a6eb29f74ef6df481cd92cb09ae6fbfb42890b5d84cc965216e9e0b8350f5e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mohawk \
python3.13dist-mohawk \
python313-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
