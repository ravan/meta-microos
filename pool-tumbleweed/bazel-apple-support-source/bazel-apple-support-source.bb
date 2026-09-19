SUMMARY = "Source code of bazel-apple-support"
DESCRIPTION = "Set of helper methods for Bazel that support building rules for Apple platforms. \
 \
This package contains source code for bazel-apple-support."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "bazel-apple-support-source-0.7.1-1.18.noarch.rpm"
RPM_HASH = "85c8cacee9cda216747fca486cd8366fd518bc4dbb093ab73ddb6d71cc4db834516ff06090dbc993f6aeec55908ac83bcd3fe0e1a6041c38275dca85450a8ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-apple-support-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
