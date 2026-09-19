SUMMARY = "Protocol Buffers using Python type annotations"
DESCRIPTION = "Protocol Buffers using Python type annotations."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "python313-pure-protobuf-3.1.5-1.4.noarch.rpm"
RPM_HASH = "78a5ce10f93eddba9d290b3050ae94ad8aa880c15f794aef464560ce42caffa7fc86434041333165ca350eae66758ae54d3961ce19960634e4e92a8009c8dc70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-protobuf \
python3.13dist-pure-protobuf \
python313-pure-protobuf \
python3dist-pure-protobuf"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
