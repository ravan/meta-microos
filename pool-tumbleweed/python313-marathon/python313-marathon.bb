SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-marathon-0.13.0-3.11.noarch.rpm"
RPM_HASH = "a6fc85051720ae82aac92d3af264b0b3ac6e169c54fdad4d1c2cb47410eb55cf3cee5aa5e75d8a59a3f3ebe026f82f3f4a0da0c64362146e57cc3c36f7970035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marathon \
python3.13dist-marathon \
python313-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-requests-toolbelt"

inherit rpm
