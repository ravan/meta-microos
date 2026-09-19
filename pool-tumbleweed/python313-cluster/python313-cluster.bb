SUMMARY = "Clustering library for python"
DESCRIPTION = "The python-cluster package allows you to create several groups \
(clusters) of objects from a list. It’s meant to be flexible and able \
to cluster any object. To ensure this kind of flexibility, you need \
not only to supply the list of objects, but also a function that \
calculates the similarity between two of those objects. For simple \
datatypes, like integers, this can be as simple as a subtraction, but \
more complex calculations are possible. Right now, it is possible to \
generate the clusters using a hierarchical clustering and the popular \
K-Means algorithm. For the hierarchical algorithm there are different \
“linkage” (single, complete, average and uclus) methods available."
LICENSE = "LGPL-2.0-or-later"

PV = "1.4.1.post2"

RPM_NAME = "python313-cluster-1.4.1.post2-4.5.noarch.rpm"
RPM_HASH = "0f05966cfa3abc7c3c568cf7366c7db931192a6fd58593d4ae772ba658f3ea1fec9f79b4f0296e2a14754a5a2f53d88e92574cdac1ef7134d5ff940d93cd77ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cluster \
python3.13dist-cluster \
python313-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-scipy"

inherit rpm
