SUMMARY = "Source code of bazel-rules-java"
DESCRIPTION = "Bazel rules which support building software written in Java. \
 \
This package contains source code of bazel-rules-java."
LICENSE = "Apache-2.0"

PV = "20190628"

RPM_NAME = "bazel-rules-java-source-20190628-1.18.noarch.rpm"
RPM_HASH = "1a3e3442ead23ef59e234512755ae41fdde79e8af1947486c87ca6b51b4f0ace0b7a3a58557136b4d34c02f00fcc7ac7e983b6b151a754aaebd19b81e2d79116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-java-source"

RDEPENDS:${PN} += ""

inherit rpm
