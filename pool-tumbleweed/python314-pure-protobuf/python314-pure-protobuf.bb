SUMMARY = "Protocol Buffers using Python type annotations"
DESCRIPTION = "Protocol Buffers using Python type annotations."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "python314-pure-protobuf-3.1.5-1.4.noarch.rpm"
RPM_HASH = "c9da40827f968e56b244b2625b745cf55e18fdf96e1defc4158ab8b798b52abbb09ffbd07f77d2f744efa108e468fffca6b00951a7ce2b6eec22fbe596ee059e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pure-protobuf \
python314-pure-protobuf \
python3dist-pure-protobuf"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
