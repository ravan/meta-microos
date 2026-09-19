SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python313-azure-search-documents-12.0.0-1.2.noarch.rpm"
RPM_HASH = "892b3657a4fa6f4251bfd48205fb1169385b9710ea3529b388137debe990ded5c525a7523d6e75c90edc491eb75cb156fe48dc72cae82ba5d7a16c4868f7146d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-documents \
python3.13dist-azure-search-documents \
python313-azure-search-documents \
python3dist-azure-search-documents"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.37.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-search-nspkg \
python313-typing-extensions"

inherit rpm
