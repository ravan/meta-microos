SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python313-apns2-0.7.2-4.4.noarch.rpm"
RPM_HASH = "328e867e82190ec51dbd2ccdd0677a278fd697cc0281fd43250ea0aea1f7995a9ca779e45a588d3bb36982d88bfca8a126011c4680666e026b3a04c4a8d530ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apns2 \
python3.13dist-apns2 \
python313-apns2 \
python3dist-apns2"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-cryptography \
python313-h2 \
python313-httpx"

inherit rpm
