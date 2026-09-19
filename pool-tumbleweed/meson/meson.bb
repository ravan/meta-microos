SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "meson-1.12.0-2.1.noarch.rpm"
RPM_HASH = "c8aadda684723d3269e3c079f96c904812dc8ad3040a1fffd2d55fa4860c78984540b83bc550de3b6277dcf0431c2d86f113a5ed0df6c4d3f70dcfdaed3633ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson \
meson-gui \
python3.13dist-meson \
python3dist-meson \
rpm-macro-buildsystem-meson-build \
rpm-macro-buildsystem-meson-check \
rpm-macro-buildsystem-meson-conf \
rpm-macro-buildsystem-meson-generate-buildrequires \
rpm-macro-buildsystem-meson-install \
rpm-macro-meson \
rpm-macro-meson-build \
rpm-macro-meson-buildrequires \
rpm-macro-meson-install \
rpm-macro-meson-test"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ninja \
python-abi \
python3-base"

inherit rpm
