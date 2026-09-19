SUMMARY = "Linux-native fakeroot using user namespaces"
DESCRIPTION = "RootlessKit is a Linux-native implementation of 'fake root' \
using user_namespaces. RootlessKit is intended to run Docker and \
Kubernetes as an unprivileged user (known as 'Rootless mode'), so as to protect \
the real root on the host from potential container-breakout attacks."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "rootlesskit-3.1.0-1.1.aarch64.rpm"
RPM_HASH = "bdc15216fc671d603f367a0c835628e567a3480bbc5a3eabef19dc048b13e13568e97c35bf078df76a5ab6ad700dc53af591ad11dff4d08d541c32253d6a0d72"

RPROVIDES:${PN} += "rootlesskit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
