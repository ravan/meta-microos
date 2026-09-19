SUMMARY = "Source code for containerd"
DESCRIPTION = "This package contains the source code needed for building packages that \
reference the following Go import paths: github.com/containerd/containerd"
LICENSE = "Apache-2.0"

PV = "1.7.33"

RPM_NAME = "containerd-devel-1.7.33-1.3.noarch.rpm"
RPM_HASH = "043e7f59045479dd066eaa9880024a4f9989f56ce5dabd45bdcaadb222783f0644400cad189f81c71f168a1d4e9e339507957ae2ae3eb26c03f2242b6cc6baff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "containerd-devel"

RDEPENDS:${PN} += "containerd"

inherit rpm
