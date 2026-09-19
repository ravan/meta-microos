SUMMARY = "Library for cross-platform detection of special directories (development files)"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code. \
 \
These are Development files for the PlatformFolders library."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "PlatformFolders-devel-4.3.0-1.4.aarch64.rpm"
RPM_HASH = "43c9f6aba14fee941bc5b5cfa3b2ffcce9dfc32359487744de39890905cca752db02827bc767e435fc20cc9e6b5236888a2678d71d93b3f7e86e7373fce807da"

RPROVIDES:${PN} += "PlatformFolders-devel \
cmake-platform-folders"

RDEPENDS:${PN} += "PlatformFolders"

inherit rpm
