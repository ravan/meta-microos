SUMMARY = "Java Cube Reader Library"
DESCRIPTION = "Java Cube Reader Library is a native Java library for reading of a \
multi-dimensional performance space consisting of the dimensions \
(i) performance metric, (ii) call path, and (iii) system resource. \
Each dimension can be represented as a tree, where non-leaf nodes \
of the tree can be collapsed or expanded to achieve the desired level \
of granularity."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.4.1"

RPM_NAME = "jcuber-4.4.1-3.8.noarch.rpm"
RPM_HASH = "f89ebe456d824a3d5a4b42ac76767c54cb2bb6ea9b9ec78aa35ee66ef60326c07257d91943427575c02db181bb4deb0bd2acb4ae38ab2165cfa5c66efc89f6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
