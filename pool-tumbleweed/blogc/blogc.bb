SUMMARY = "Blog compiler"
DESCRIPTION = "blogc is a blog compiler. It converts source files and templates into blog/website resources."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "blogc-0.20.1-1.21.aarch64.rpm"
RPM_HASH = "44b98bf63f21a386a48d81a0e660dc35785b08bd41f8b7dad9b545d2d790ce3f3f539e9bb34e1fb06c52dae30f56176e30c641859b84033e3f7f6a176dbb8ead"

RPROVIDES:${PN} += "blogc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
