SUMMARY = "Development files for xtensor"
DESCRIPTION = "xtensor is a C++ library meant for numerical analysis with multi-dimensional array expressions. \
 \
xtensor provides \
   - an extensible expression system enabling lazy broadcasting. \
   - an API following the idioms of the C++ standard library. \
   - tools to manipulate array expressions and build upon xtensor. \
 \
Containers of xtensor are inspired by NumPy, the Python array programming library. Adaptors for existing data structures to be plugged into the expression system can easily be written."
LICENSE = "BSD-3-Clause"

PV = "0.27.1"

RPM_NAME = "xtensor-devel-0.27.1-1.5.noarch.rpm"
RPM_HASH = "55480cbfa07d98d5e0d13e6307afed2289335c2d52cdeba814254cb975857e64a62276c3115e626924f9e61d7c8da8bc5bd2b8d385e3b2aff28988929ba1452b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-xtensor \
pkgconfig-xtensor \
xtensor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xtl-devel"

inherit rpm
