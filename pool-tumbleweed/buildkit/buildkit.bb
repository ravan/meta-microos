SUMMARY = "Toolkit for converting source code to build artifacts"
DESCRIPTION = "BuildKit is a toolkit for converting source code to build artifacts in an efficient, expressive and repeatable manner."
LICENSE = "Apache-2.0"

PV = "0.32.2"

RPM_NAME = "buildkit-0.32.2-1.1.aarch64.rpm"
RPM_HASH = "2162b56580f3b7abe9719a3ed42d1da90457127b536b96006ff60824a513f0f3767bad030306583e2e49b0a4dd3d654731fdbc9986469b04d5732459a0347f43"

RPROVIDES:${PN} += "buildkit"

RDEPENDS:${PN} += "/usr/bin/sh \
containerd \
libc.so.6 \
runc"

inherit rpm
