SUMMARY = "Bazel toolchains for Envoy and UDPA build ecosystem"
DESCRIPTION = "envoy-build-tools is the project which contains custom Bazel toolchains which \
define the compiler flags for Envoy."
LICENSE = "Apache-2.0"

PV = "20191023"

RPM_NAME = "envoy-build-tools-20191023-1.18.noarch.rpm"
RPM_HASH = "0804af28abf7d08ebc5e406411eff4887a48130f80ebc78a02f1be43257dadf87e337fd3491b331b64eb83c67897201f7c80ab44ec2cb68290a0c8119a31b7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "envoy-build-tools"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
