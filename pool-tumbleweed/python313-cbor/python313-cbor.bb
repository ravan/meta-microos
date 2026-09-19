SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-cbor-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "19eaeaca962503ea98698b41fe1bec1e14b21e89f84c70c9e40bca071a3994b94bea1a991eddec2bcb85165eb332882bf49916e23aaea20ee48ad075a33028bc"

RPROVIDES:${PN} += "python3-cbor \
python3.13dist-cbor \
python313-cbor \
python3dist-cbor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
