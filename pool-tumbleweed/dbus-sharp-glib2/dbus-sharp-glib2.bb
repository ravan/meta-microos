SUMMARY = "Glib integration for DBus"
DESCRIPTION = "This package provides glib integration for Mono.DBus."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "dbus-sharp-glib2-0.6.0-2.16.noarch.rpm"
RPM_HASH = "a6ef40d4ce0e5cb1d9d421f77403650fe060591cf98b0883c48d5dcf5f6d55505dad9efbd0b056d9edbb55ea550a30f9b1733179ab8f0db89af958cae40bedd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib2 \
mono-dbus-sharp-glib"

RDEPENDS:${PN} += "dbus-sharp \
mono-dbus-sharp \
mono-mscorlib"

inherit rpm
