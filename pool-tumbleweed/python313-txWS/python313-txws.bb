SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python313-txWS-0.9.1-5.5.noarch.rpm"
RPM_HASH = "039b06c20c34b0eb451db4a6d3fd7abe2e28d0b86bac322df4c7f7a6db6ffefbe1f4926c0f4ed5d42700e016a03c6ef299a43d0d357f0873993cb9ede002975c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txWS \
python3.13dist-txws \
python313-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python313-Twisted"

inherit rpm
