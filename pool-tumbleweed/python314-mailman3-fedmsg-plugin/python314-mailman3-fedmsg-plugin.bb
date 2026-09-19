SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python314-mailman3-fedmsg-plugin-0.5-2.10.noarch.rpm"
RPM_HASH = "146f45b1e93a864bff9ecf995c54eb9adf4d40e1d61944de0aa8715e25a62527c5402450d5ffca59b94c7a250ab347fae1d3e0ee8e347e44d865b8a97d3c74ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mailman3-fedmsg-plugin \
python314-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
