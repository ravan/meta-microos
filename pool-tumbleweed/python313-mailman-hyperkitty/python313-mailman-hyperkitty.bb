SUMMARY = "Mailman archiver plugin for HyperKitty"
DESCRIPTION = "Mailman archiver plugin for HyperKitty"
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "python313-mailman-hyperkitty-1.2.1-5.3.noarch.rpm"
RPM_HASH = "6c1581d8c166d0ffdacd91d26d59cb01757cfee0099efc5fc9b8f9e1a705af3dc9b7ae4879cb4702e935649730954a38cda618a31dd9acf4c412e5c33d29c7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-mailman-hyperkitty \
python313-mailman-hyperkitty \
python3dist-mailman-hyperkitty"

RDEPENDS:${PN} += "-mailman3 >= 3.3.5 with python313-mailman3 \
python-abi \
python313-requests \
python313-zope.interface"

inherit rpm
