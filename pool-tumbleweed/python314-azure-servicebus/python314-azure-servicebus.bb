SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.14.3"

RPM_NAME = "python314-azure-servicebus-7.14.3-1.4.noarch.rpm"
RPM_HASH = "201d652244382a41bad767a13a5d36c3c233c33a2bbb05be33b6e8e07033d52a0f701b00cdf9bb0395bacce7be4e6e42cdd052a5fe0abc62e7e251ee7b5203a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-servicebus \
python314-azure-servicebus \
python3dist-azure-servicebus"

RDEPENDS:${PN} += "-python314-azure-core >= 1.28.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
