SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.14.3"

RPM_NAME = "python313-azure-servicebus-7.14.3-1.4.noarch.rpm"
RPM_HASH = "9e2810d90e836ac60c54e7a9d361e9bd4f39c31da8e9cba4a248762be1bd1aeb685bae315f1973b5bc0f1b073375dfc94553a6798056c7635df2b2d4dcbaa6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicebus \
python3.13dist-azure-servicebus \
python313-azure-servicebus \
python3dist-azure-servicebus"

RDEPENDS:${PN} += "-python313-azure-core >= 1.28.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
