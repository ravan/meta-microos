SUMMARY = "API for encoding and decoding dataclasses to and from JSON"
DESCRIPTION = "This library provides a simple API for encoding and decoding dataclasses to and from JSON. \
 \
It's very easy to get started."
LICENSE = "MIT"

PV = "0.6.7"

RPM_NAME = "python313-dataclasses-json-0.6.7-7.1.noarch.rpm"
RPM_HASH = "ecde17263f075fc430603dd2f0baf810fd49ff89f3e96b3226ec02853512a83b918c7f51bcffafa2f4329a389ac9c1f6a9edc67f462daf73c646010eb585b2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dataclasses-json \
python3.13dist-dataclasses-json \
python313-dataclasses-json \
python3dist-dataclasses-json"

RDEPENDS:${PN} += "python-abi \
python313-marshmallow \
python313-typing-inspect"

inherit rpm
