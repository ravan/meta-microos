SUMMARY = "QtQuick bindings for kpipewire6"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides QtQuick bindings for the main KPipeWire libraries."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "kpipewire6-imports-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "77e7c330939899ee32383685b6ab4323e2c742afa3573abdfe7cf103e4c573c7fec351d51c77cebd456002e1a0df3e4a182f488fd09a9c9fdc571e6ed5a44f4a"

RPROVIDES:${PN} += "kpipewire6-imports \
libKPipeWireMonitorDeclarative.so \
libKPipeWireRecordplugin.so \
libKPipeWireplugin.so \
qt6qmlimport-org.kde.pipewire \
qt6qmlimport-org.kde.pipewire.1 \
qt6qmlimport-org.kde.pipewire.monitor \
qt6qmlimport-org.kde.pipewire.monitor.1 \
qt6qmlimport-org.kde.pipewire.record \
qt6qmlimport-org.kde.pipewire.record.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPipeWire.so.6 \
libKPipeWire6 \
libKPipeWireDmaBuf6 \
libKPipeWireRecord.so.6 \
libKPipeWireRecord6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
