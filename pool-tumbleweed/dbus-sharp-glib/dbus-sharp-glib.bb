SUMMARY = "Glib integration for DBus"
DESCRIPTION = "This package provides glib integration for Mono.DBus."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "dbus-sharp-glib-0.5.0-15.15.noarch.rpm"
RPM_HASH = "5fe4c9faa2d83cfb6da6dab6f6098d228a4f6d87a959a5d6318f3bb1dcd7604e86af8bbbdc0e8c84e15191a958470d9b36ea90cf5718c2b46fa76632f2c56051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib \
mono-dbus-sharp-glib"

RDEPENDS:${PN} += "dbus-sharp \
mono-dbus-sharp \
mono-mscorlib"

inherit rpm
