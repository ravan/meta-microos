SUMMARY = "Tools for tracing OpenGL"
DESCRIPTION = "This package contains libs that are preloaded into traced programs."
LICENSE = "MIT"

PV = "13.0"

RPM_NAME = "apitrace-wrappers-13.0-1.7.aarch64.rpm"
RPM_HASH = "19e57387e0bc7dfdf7bce3974d5b413153265189b2efebac3b95483546913dc3ad9294eb7328bdedc822541e995cf67587a5543fe5766d1bee48ef49bc840737"

RPROVIDES:${PN} += "apitrace-wrappers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbacktrace.so.0 \
libc.so.6 \
libsnappy.so.1"

inherit rpm
