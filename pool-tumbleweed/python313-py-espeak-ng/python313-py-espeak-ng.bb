SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python313-py-espeak-ng-0.1.8-2.5.noarch.rpm"
RPM_HASH = "f6eef73cb1bc444b8de6c33c989ede75a57d9ea506614f8592f7f67199d4b4c363d9b96f906c7f254b53109afea36a5b414a650a8d1b001ccdfbabd5ee66e38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-espeak-ng \
python3.13dist-py-espeak-ng \
python313-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
