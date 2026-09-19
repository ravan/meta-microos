SUMMARY = "Documentation for for jcuber"
DESCRIPTION = "Java Cube Reader Library is a native Java library for reading of a \
multi-dimensional performance space consisting of the dimensions \
(i) performance metric, (ii) call path, and (iii) system resource. \
Each dimension can be represented as a tree, where non-leaf nodes \
of the tree can be collapsed or expanded to achieve the desired level \
of granularity. \
This package contains the documentation and examples for jcuber."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.4.1"

RPM_NAME = "jcuber-doc-4.4.1-3.8.noarch.rpm"
RPM_HASH = "3fbe8bc82010d302505977da60a0622d4a0264f8ed9c07bca89ba6fed351c0f0f399ee144bc190b380591a1c9f8bad528806be7c98f5de2ec233fc74fede51c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber-doc"

RDEPENDS:${PN} += ""

inherit rpm
