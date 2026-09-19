SUMMARY = ".NET/C# Bindings for GKeyFile"
DESCRIPTION = "C#/CLI bindings for GKeyFile"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gkeyfile-sharp-0.2-18.28.aarch64.rpm"
RPM_HASH = "624334ae7974407e0f53e5968caffa02532c4525125d07def143c0ee61baa2a2c0d2ff70be0dbc4cea96ec274960c170f405fa5ccea04cdc7755e7ff133f3c37"

RPROVIDES:${PN} += "gkeyfile-sharp \
mono-gkeyfile-sharp"

RDEPENDS:${PN} += "glib-sharp2 \
mono-core \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
