SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.28.4"

RPM_NAME = "python314-proto-plus-1.28.4-1.1.noarch.rpm"
RPM_HASH = "8993108e4e2ef121e24be5163c7c5ebe929fe073da2aa468ee141b4e5b208712ede6584457e91cb4d159077e57f7e0b2998556c69235d5c65a96f5279ae6cc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proto-plus \
python314-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python314-protobuf"

inherit rpm
