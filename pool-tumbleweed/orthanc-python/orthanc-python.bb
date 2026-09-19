SUMMARY = "Python plugin for Orthanc"
DESCRIPTION = "This plugin can be used to write Orthanc plugins in Python instead of C++ \
See /usr/share/doc/packages/orthanc/orthanc-python-readme.openSUSE"
LICENSE = "AGPL-3.0-or-later"

PV = "7.1"

RPM_NAME = "orthanc-python-7.1-1.5.aarch64.rpm"
RPM_HASH = "8197b7abd1ebb06a9c8db85e03fafb1f6885dbe5ab8d312efd58bf895ca97e4ff22900f8d4e2ea9ec1e60f30f27d3f5d47b057b3addd1d36cc2b13a87447ee20"

RPROVIDES:${PN} += "libOrthancPython.so.7.1 \
orthanc-python"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
orthanc"

inherit rpm
