SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-minimal-5.1.0-3.3.aarch64.rpm"
RPM_HASH = "cec669a28977a61f24bd61e2333ad5b6b16f4b6c0ebcc367816faf8a64fdab9753812eebb07b9bc52b8f3dc7633b3084f1593892e0b3a80c92d1f9a676b7d278"

RPROVIDES:${PN} += "xmvn5-minimal"

RDEPENDS:${PN} += "/usr/bin/sh \
kojan-xml \
maven4 \
maven4-lib \
xmvn5-api \
xmvn5-connector \
xmvn5-core"

inherit rpm
