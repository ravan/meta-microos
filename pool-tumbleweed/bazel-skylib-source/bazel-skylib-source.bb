SUMMARY = "Source code of bazel-skylib"
DESCRIPTION = "Skylib is a standard library that provides functions for manipulating \
collections, file paths, and common features for writing custom build rules in \
Bazel. \
 \
This package contains source code of Skylib."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "bazel-skylib-source-1.0.3-2.14.noarch.rpm"
RPM_HASH = "547a7742eab84cc370b6950574484ffb917762254162c39a6262fd9ff1efbe90aa15bb3da0be16e226d5d8d5577d45947a988308051fe2949f024cb552b9ed7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-skylib-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
