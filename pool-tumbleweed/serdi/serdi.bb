SUMMARY = "Read and write RDF syntax"
DESCRIPTION = "Read and write RDF syntax."
LICENSE = "ISC"

PV = "0.32.10"

RPM_NAME = "serdi-0.32.10-1.1.aarch64.rpm"
RPM_HASH = "ef3242ca16459f932636d68c46061be5a124feb04a591bbc63123c4695fa6482170d37e0cddcc26deff4d99beff8eb0f48186215e3d642ec74cc74b900d1cf4e"

RPROVIDES:${PN} += "serdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0.so.0"

inherit rpm
