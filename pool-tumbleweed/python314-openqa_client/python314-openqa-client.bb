SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python314-openqa_client-4.3.1-2.2.noarch.rpm"
RPM_HASH = "9180861e68273fb75203e0dbe384a072627ca54f520872ab67d13c0098c06c9130bce932d53acb903be9757db19b50ad26f81a6d3652f78f192f23ac9f5c924d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openqa-client \
python314-openqa-client \
python3dist-openqa-client"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-requests"

inherit rpm
