SUMMARY = ".NET/C# Bindings for GUDev"
DESCRIPTION = "C#/CLI bindings for GUDev"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gudev-sharp-0.2-21.18.aarch64.rpm"
RPM_HASH = "2e35846d3c161eb27f05faad8b389ed77eee1e74f5767d519ee613f2ee9011c534df51ac125e8cc7050d72a573ade9b79e533c34569f43335dee6c3e8b567782"

RPROVIDES:${PN} += "gudev-sharp \
mono-gudev-sharp"

RDEPENDS:${PN} += "gtk-sharp2 \
libgudev-1-0-0 \
mono-core \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
