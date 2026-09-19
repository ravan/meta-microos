SUMMARY = "Tools for building lxqt"
DESCRIPTION = "This package provides several tools needed to build LXQt itself as well as \
other components maintained by the LXQt project. \
 \
These tools used to be spread over the repositories of various other \
components and were summarized to ease dependency management. So far many \
components, in particular [liblxqt](https://github.com/lxde/liblxqt), were \
representing a build dependency without being needed themselves but only \
because their repository was providing a subset of the tools which are now \
summarized here. So the use of this repository will reduce superfluous and \
bloated dependencies."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "lxqt2-build-tools-devel-2.4.0-1.2.noarch.rpm"
RPM_HASH = "ea2bfa3019f9edb6ffa5c9a806e00ec298be7932dfbb70df1cb3e4db7e7a2fd50d3e49fefba20111d6a2c873682a83c524f4226c064e6e9e4e1f554c799ad053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-lxqt2-build-tools \
lxqt2-build-tools-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cmake-Qt6Core"

inherit rpm
