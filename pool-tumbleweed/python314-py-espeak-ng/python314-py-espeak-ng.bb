SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python314-py-espeak-ng-0.1.8-2.5.noarch.rpm"
RPM_HASH = "01d01ac45c1e1422177626a6c0c9d6a5c9372c6809ebd70c0bfc33939ae48cd65f58bbf61b5b437c75b3f53f5617ee3375e53c92b231f83527b6b11c8ce43a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-espeak-ng \
python314-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
