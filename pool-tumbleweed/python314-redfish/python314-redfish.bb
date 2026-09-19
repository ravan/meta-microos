SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python314-redfish-3.4.0-1.1.noarch.rpm"
RPM_HASH = "a059a66382c24c5c0989624e132e69601aa77fb829918b1dbd9e1edcbdf5607aa42f771af07317e599d541064d5cb4ebed7a51f5e030945d0ee4f7071737bf82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-redfish \
python314-redfish \
python3dist-redfish"

RDEPENDS:${PN} += "python-abi \
python314-jsonpatch \
python314-jsonpath-ng \
python314-jsonpointer \
python314-requests \
python314-requests-toolbelt \
python314-requests-unixsocket"

inherit rpm
