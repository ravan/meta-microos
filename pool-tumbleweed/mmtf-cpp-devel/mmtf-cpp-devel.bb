SUMMARY = "Development files of mmtf-cpp"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use mmtf-cpp."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "mmtf-cpp-devel-1.1.0-1.11.noarch.rpm"
RPM_HASH = "32e3fae8874da4c817f4b5e5b6b85b143521485f0fdcd0fafcce23396f2bbd76d21c0071b62c217b3f9b2d764c922012b3f69d84152a7f79dfa54d998261bc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mmtf-cpp-devel"

RDEPENDS:${PN} += "msgpack-cxx-devel"

inherit rpm
