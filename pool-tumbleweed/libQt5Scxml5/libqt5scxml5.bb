SUMMARY = "Qt 5 State Chart XML Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt SCXML module provides functionality to create state machines \
from SCXML files. This includes both dynamically creating state \
machines (loading the SCXML file and instantiating states and \
transitions) and generating a C++ file that has a class implementing \
the state machine. It also contains functionality to support data \
models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Scxml5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a91570d702cdb2b161ab55056a167fdac2b23aeaf3166eeab2987befae95007ff97069dbdeba8b5b729489a03482787822576a70b95996753661b185efdd14ae"

RPROVIDES:${PN} += "libQt5Scxml.so.5 \
libQt5Scxml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
