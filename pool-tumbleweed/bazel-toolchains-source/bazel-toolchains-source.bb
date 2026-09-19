SUMMARY = "Source code of bazel-toolchains"
DESCRIPTION = "bazel-toolchains is a repository of commonly used Bazel toolchain configuration \
files. They are required to configure Bazel to work inside a Docker container \
via a remote execution environment. \
 \
This package contains source code of bazel-toolchains."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "bazel-toolchains-source-2.0.0-1.17.noarch.rpm"
RPM_HASH = "e78a337bebc5531ebcfe72219a99a7b5ffb4721d90976798e12d6bdb90dfda83602a4e6723bd1cd246451f003a3cd55d2bbdf59189fc949a5526f83511426bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-toolchains-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env"

inherit rpm
