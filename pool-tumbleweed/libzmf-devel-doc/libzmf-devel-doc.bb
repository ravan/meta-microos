SUMMARY = "Documentation of libzmf API"
DESCRIPTION = "The libzmf-doc package contains documentation files for libzmf."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-doc-0.0.2-2.8.noarch.rpm"
RPM_HASH = "d58937f5d2654532ca3d8f0bddb1509d93f2b4b93305cc8607dd73cb34ee6ebb5e4984206f10888751ff311311275098ed40ccd6859feb2f63985c3cf6f58969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libzmf-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
