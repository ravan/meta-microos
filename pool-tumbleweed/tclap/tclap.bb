SUMMARY = "Templatized C++ Command Line Parser"
DESCRIPTION = "TCLAP is a small, flexible library that provides a simple interface for \
defining and accessing command line arguments. It was intially inspired by the \
user friendly CLAP libary. The difference is that this library is templatized, \
so the argument class is type independent. Type independence avoids \
identical-except-for-type objects, such as IntArg, FloatArg, and StringArg. \
While the library is not strictly compliant with the GNU or POSIX standards, it \
is close."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "tclap-1.2.5-3.12.aarch64.rpm"
RPM_HASH = "1cb0ed35e02d234815c56a043203d869fa7deece5f41f3206df7178b67da0a6b59968de31e9afcab366f88c385c09b6cc23c89bac0877c63bc96b9bd01011659"

RPROVIDES:${PN} += "libtclap \
libtclap-devel \
pkgconfig-tclap \
tclap"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
