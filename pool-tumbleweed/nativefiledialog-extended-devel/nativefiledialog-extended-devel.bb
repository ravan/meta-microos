SUMMARY = "Development files for nativefiledialog-extended"
DESCRIPTION = "A small C library with that portably invokes native file open, folder \
select and file save dialogs. Write dialog code once and have it pop up \
native dialogs on all supported platforms. Avoid linking large \
dependencies like wxWidgets and Qt. \
This library is based on Michael Labbe's Native File Dialog \
(mlabbe/nativefiledialog)."
LICENSE = "Zlib"

PV = "1.2.1"

RPM_NAME = "nativefiledialog-extended-devel-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "42c3a266b32226dcadf75aa91a4b5c8bf29ee10b339eef5a12ee352538f7c627a40aed727b4c8fc9b573e84ca767b3eae255d902a8781ff6f66d57fde8733440"

RPROVIDES:${PN} += "cmake-nfd \
nativefiledialog-extended-devel \
pkgconfig-nfd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfd1"

inherit rpm
