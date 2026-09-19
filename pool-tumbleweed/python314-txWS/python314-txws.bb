SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python314-txWS-0.9.1-5.5.noarch.rpm"
RPM_HASH = "b2efb9b41ab89fca6ef9b20e329053e5a684e0cc9619280dcd5fe74040ebc66abb3633157452e760b794fa9a951697fa282125a58bcc3dfb46a2686173040bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txws \
python314-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python314-Twisted"

inherit rpm
