SUMMARY = "Source code of bazel-rules-proto"
DESCRIPTION = "bazel-rules-proto is a set of Bazel rules for building Protocol Buffers. \
 \
This package contains source code of bazel-rules-proto."
LICENSE = "Apache-2.0"

PV = "20190801"

RPM_NAME = "bazel-rules-proto-source-20190801-1.18.noarch.rpm"
RPM_HASH = "ee2dc489f2afb55492e0f94f26f50869b2a66742382368a87bec0b3227690499a84f833f7e729e5f33008b75c4d6f2a2d22442d81ee2857f1b706d19ebbead7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-proto-source"

RDEPENDS:${PN} += ""

inherit rpm
