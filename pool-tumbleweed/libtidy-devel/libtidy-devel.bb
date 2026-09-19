SUMMARY = "Development files for libtidy"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using functions provided by the TidyLib library."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "libtidy-devel-5.8.0-2.5.aarch64.rpm"
RPM_HASH = "410914e082dff08e497ef970dd09eec1220f8025e71ead7ada1402d383c67bf3ecb2f833f44169a1f25b8d61b6301c174e4c009b47f8eac1793426a9abc0e956"

RPROVIDES:${PN} += "libtidy-devel \
pkgconfig-tidy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtidy58"

inherit rpm
