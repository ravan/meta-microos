SUMMARY = "Development files for the 'fastlzlib' compression library"
DESCRIPTION = "Header files for the fastlzlib library, a library that bundles and \
wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-devel-0.0+git.20150524-3.11.aarch64.rpm"
RPM_HASH = "624ed8af5772d76b112584e257c833e91edfa99ca972aabb3380e01ec7b5c1381328aaea1557f22bbfbc06d4ee931632a6893a03b567c54279d0d57a3f990f13"

RPROVIDES:${PN} += "fastlzlib-devel"

RDEPENDS:${PN} += "libfastlz1"

inherit rpm
