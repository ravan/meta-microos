SUMMARY = "Header files for gl3w"
DESCRIPTION = "gl3w is a way to get at functionality offered by the \
OpenGL core profile specification. \
 \
This package contains header files for gl3w."
LICENSE = "Unlicense"

PV = "2022.03.24"

RPM_NAME = "gl3w-devel-2022.03.24-2.12.aarch64.rpm"
RPM_HASH = "6dcfa2bb87fcfbd148d103a884eb548421d6b7722c5695a124f45add97c6e4bdd8370515288bff7d35ee35537e41d68f55ee528b43608982431aa088de0d0dc7"

RPROVIDES:${PN} += "gl3w-devel"

RDEPENDS:${PN} += ""

inherit rpm
