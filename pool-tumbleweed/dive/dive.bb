SUMMARY = "Tool for exploring each layer in a docker image"
DESCRIPTION = "A tool for exploring a docker image, layer contents, and discovering ways to \
shrink the size of your Docker/OCI image."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "dive-0.13.1-1.8.aarch64.rpm"
RPM_HASH = "02335a587fc5a1b34c86a67061e040ce9f0d6f38544f34e799ab0df40708d707d62411819f66d57f865269f2d7263a777e48806cc7061970a78da4918e366408"

RPROVIDES:${PN} += "dive"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
