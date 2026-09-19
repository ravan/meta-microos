SUMMARY = "Devel Package to nvidia-open-driver-G06-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-longterm-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "74759da3663d5e6ba0ac71edb6d8ecd3e83e9230922d6567d829f71c5ce13ef5efb17e849f40ddb321fb689aa24b8e5726425ea857b94a0c51b05035a41b2695"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-longterm-devel \
nvidia-open-driver-G06-signed-longterm-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
