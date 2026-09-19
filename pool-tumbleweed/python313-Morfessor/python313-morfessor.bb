SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python313-Morfessor-2.0.6-3.5.noarch.rpm"
RPM_HASH = "9ee915d09224b392b41e554bdca9a969ce04bbd09060bdac71adb83dffc160b7b00e21b598241cf2115c4e3eac8660c3d836aa3e29a7d5d43b0aec0754988995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Morfessor \
python3.13dist-morfessor \
python313-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
