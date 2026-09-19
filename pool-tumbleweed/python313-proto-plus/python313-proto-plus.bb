SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.28.4"

RPM_NAME = "python313-proto-plus-1.28.4-1.1.noarch.rpm"
RPM_HASH = "cd62e17a958964b2dce34819f2b8f3eb46cb7868b4045833cf3e043f6c61d3dab4aaed7e97d1053c32121779e69ca2f6bac8e4513e6291c39e34dab7ca734fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proto-plus \
python3.13dist-proto-plus \
python313-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python313-protobuf"

inherit rpm
