SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python313-requests-hawk-1.2.1-2.10.noarch.rpm"
RPM_HASH = "4bffc832bf7663e8f23453a68d89e0a0952dd524473aa8c4454f24ea677cf930338697fcd832a87d39d78126eee77525ee53c322facdd9cb8983ef0fadeefbb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-hawk \
python3.13dist-requests-hawk \
python313-requests-hawk \
python3dist-requests-hawk"

RDEPENDS:${PN} += "python-abi \
python313-mohawk \
python313-requests"

inherit rpm
