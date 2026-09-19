SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects. \
 \
This package provides a static library that can be injected into a \
process running on the target in order to get information about the \
internal state machines."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "libkdstatemachineeditor_debuginterfacesource-qt6-static-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "1b1a51ec6118ec84e52ce5fb93c2186876a392b1c1d5d554fd994c86a080d5a322281c982044409130079d4d29d4ec0c4e2c5f9befb4782bcf9bb89be504c21c"

RPROVIDES:${PN} += "libkdstatemachineeditor-debuginterfacesource-qt6-static"

RDEPENDS:${PN} += ""

inherit rpm
