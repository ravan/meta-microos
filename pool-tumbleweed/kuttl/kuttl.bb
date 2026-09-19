SUMMARY = "KUbernetes Test TooL"
DESCRIPTION = "KUbernetes Test TooL (KUTTL) provides a declarative approach to test Kubernetes \
Operators. \
 \
KUTTL is designed for testing operators, however it can declaratively test any \
kubernetes objects."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "kuttl-0.26.0-1.4.aarch64.rpm"
RPM_HASH = "0c1f1c2acd4b7015b973ff78c779784b0f5b8292452eb37bdea3ccb8d4ad9181575eeb8a573943c04cb1dbb6df88b9ed039139cbb54e8e42c7a8ed671eee0b20"

RPROVIDES:${PN} += "kuttl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
