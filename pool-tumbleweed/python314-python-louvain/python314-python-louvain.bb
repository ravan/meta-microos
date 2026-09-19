SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python314-python-louvain-0.16-2.10.noarch.rpm"
RPM_HASH = "66cd1d3cb83f56cb2759a2633f519f2b95fd16853eded8c101b8536fc3aed84594279c9e7f8a253fc4a2ad75a46f1d905706a95ad73a481899cb7725857c50c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-louvain \
python314-community \
python314-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-networkx \
python314-numpy \
update-alternatives"

inherit rpm
