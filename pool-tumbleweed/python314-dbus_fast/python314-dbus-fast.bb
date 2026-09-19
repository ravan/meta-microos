SUMMARY = "Python library for DBus"
DESCRIPTION = "python-dbus-fast is a Python library for DBus that aims to be a performant fully featured high level library primarily geared towards integration of applications into Linux desktop and mobile environments. \
 \
Desktop application developers can use this library for integrating their applications into desktop environments by implementing common DBus standard interfaces or creating custom plugin interfaces. \
 \
Desktop users can use this library to create their own scripts and utilities to interact with those interfaces for customization of their desktop environment."
LICENSE = "MIT"

PV = "5.0.22"

RPM_NAME = "python314-dbus_fast-5.0.22-1.1.aarch64.rpm"
RPM_HASH = "39bd4bf6bd39dbcbc4d6db4cdf8f675d74b7109bb45f056999b7318dfc2f0cbf9f34db87917786eacccd1e810b39c8c2ab3a37e305e30eab37a7fb09e1e3549e"

RPROVIDES:${PN} += "python3.14dist-dbus-fast \
python314-dbus-fast \
python3dist-dbus-fast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
