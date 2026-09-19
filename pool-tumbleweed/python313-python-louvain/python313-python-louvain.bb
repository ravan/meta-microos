SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python313-python-louvain-0.16-2.10.noarch.rpm"
RPM_HASH = "f1dac7a023a2af72195155babaf9cd7d604ea9a082033cffc5ef82986d8114e95aaf9833b9951c2d961be265bf536f1e688ef485ae29032b8822fd558ace3c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-community \
python3-python-louvain \
python3.13dist-python-louvain \
python313-community \
python313-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-networkx \
python313-numpy \
update-alternatives"

inherit rpm
