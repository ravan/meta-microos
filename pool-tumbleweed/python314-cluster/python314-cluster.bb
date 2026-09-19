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

RPM_NAME = "python314-cluster-1.4.1.post2-4.5.noarch.rpm"
RPM_HASH = "4dc97d5c2bc8bcd52d68e2f234908ce550a92f2f65077c06902d3a75f32b51ec2eeb4750a47fae9c748c8e45860b00c7300379bf4528b468fafe464ae20babf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cluster \
python314-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-scipy"

inherit rpm
