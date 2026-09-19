SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python313-redfish-3.4.0-1.1.noarch.rpm"
RPM_HASH = "38f024b4a510bbbe0308399aa386da69119bbc906cec4a41ef679898ef18f2282e8cd2c2f7013b5d1c176719dbb061544015c096219e98ab34110154db582d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redfish \
python3.13dist-redfish \
python313-redfish \
python3dist-redfish"

RDEPENDS:${PN} += "python-abi \
python313-jsonpatch \
python313-jsonpath-ng \
python313-jsonpointer \
python313-requests \
python313-requests-toolbelt \
python313-requests-unixsocket"

inherit rpm
