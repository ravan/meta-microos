SUMMARY = "Development files for meshoptimizer"
DESCRIPTION = "Mesh optimization library that makes meshes smaller and faster to render \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "meshoptimizer-devel-1.2-1.2.aarch64.rpm"
RPM_HASH = "2287e5f2fc00cfded88f615ff7b6dc2f87a31b07881545e6d4bdfcfae125741e59b74e1ff58cf224b37739af027fa18c2be7d99cb943e5516f744fd721241db6"

RPROVIDES:${PN} += "cmake-meshoptimizer \
meshoptimizer-devel"

RDEPENDS:${PN} += "libmeshoptimizer-1-2"

inherit rpm
