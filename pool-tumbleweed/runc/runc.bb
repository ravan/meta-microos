SUMMARY = "Tool for spawning and running OCI containers"
DESCRIPTION = "runc is a CLI tool for spawning and running containers according to the OCI \
specification. It is designed to be as minimal as possible, and is the workhorse \
of Docker. It was originally designed to be a replacement for LXC within Docker, \
and has grown to become a separate project entirely."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "runc-1.5.1-2.1.aarch64.rpm"
RPM_HASH = "5f55500eec8a0fdd81320e83dde4813e59a2892dfa72b4a69f939a62de4adda40a5415fa520ce891a517dfef5f767c9b9b3c15c6473d4d2e775f1546c91fc45b"

RPROVIDES:${PN} += "docker-runc \
docker-runc-kubic \
runc"

RDEPENDS:${PN} += "libc.so.6 \
libpathrs.so.0 \
libseccomp.so.2"

inherit rpm
