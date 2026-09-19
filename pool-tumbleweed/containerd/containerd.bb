SUMMARY = "Standalone OCI Container Daemon"
DESCRIPTION = "Containerd is a daemon with an API and a command line client, to manage \
containers on one machine. It uses runC to run containers according to the OCI \
specification. Containerd has advanced features such as seccomp and user \
namespace support as well as checkpoint and restore for cloning and live \
migration of containers."
LICENSE = "Apache-2.0"

PV = "1.7.33"

RPM_NAME = "containerd-1.7.33-1.3.aarch64.rpm"
RPM_HASH = "cc8e1a98d101f50adb101dfd8be00cfdc4c0643e99d1e456ccf152af571707f9933812000abe15acd86c03d95f56cee1a9d3239416502ca45085b1c2d50d6cba"

RPROVIDES:${PN} += "config-containerd \
containerd \
containerd-git \
containerd-kubic \
cri-runtime"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
runc"

inherit rpm
