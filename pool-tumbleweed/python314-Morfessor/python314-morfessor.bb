SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python314-Morfessor-2.0.6-3.5.noarch.rpm"
RPM_HASH = "6ab66aa22e6aa479871340c8745d54f64427af50c8514f7a939e51565b2dcc048b73bf8af4a2020b3d46579eccd7442756921d97f52c66185960a2e88c9d8458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-morfessor \
python314-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
