SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python314-requests-hawk-1.2.1-2.10.noarch.rpm"
RPM_HASH = "e83bb3bee3549e1ce5243ff84f6d3c2367762e09900f47f32b06c568c3c3442b9c3bd23d7247d7aa8f1bcff51aadf29ec3b5e209d46460defaf4260af44cceef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-hawk \
python314-requests-hawk \
python3dist-requests-hawk"

RDEPENDS:${PN} += "python-abi \
python314-mohawk \
python314-requests"

inherit rpm
