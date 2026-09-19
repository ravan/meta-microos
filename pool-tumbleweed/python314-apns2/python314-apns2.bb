SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python314-apns2-0.7.2-4.4.noarch.rpm"
RPM_HASH = "28cdba6e828b9d85a62b3b8fc237bb227bb133444d04a62db723097eb0790d03661cb7bce832a873c26ca6dbd7ca675fbefd8799391ab75c8832a8aa1b586814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apns2 \
python314-apns2 \
python3dist-apns2"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-cryptography \
python314-h2 \
python314-httpx"

inherit rpm
