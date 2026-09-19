SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python314-azure-search-documents-12.0.0-1.2.noarch.rpm"
RPM_HASH = "15b10613564aeeb272496ded979168fca0e3c86793d82ad557862f3dbba6b3f56911c67bc66ff45cb36169c36ee5d1638da36975ca8a810d061928ff474233bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-search-documents \
python314-azure-search-documents \
python3dist-azure-search-documents"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.37.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-search-nspkg \
python314-typing-extensions"

inherit rpm
