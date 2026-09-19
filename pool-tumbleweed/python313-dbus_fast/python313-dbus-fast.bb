SUMMARY = "Python library for DBus"
DESCRIPTION = "python-dbus-fast is a Python library for DBus that aims to be a performant fully featured high level library primarily geared towards integration of applications into Linux desktop and mobile environments. \
 \
Desktop application developers can use this library for integrating their applications into desktop environments by implementing common DBus standard interfaces or creating custom plugin interfaces. \
 \
Desktop users can use this library to create their own scripts and utilities to interact with those interfaces for customization of their desktop environment."
LICENSE = "MIT"

PV = "5.0.22"

RPM_NAME = "python313-dbus_fast-5.0.22-1.1.aarch64.rpm"
RPM_HASH = "47c4b73f82b284772e3e52a3562cfba98a97238b13373a2dd93b932315eabb94cb6c1166c4360f9dddb9fe4fbea0d192db6ebab54632017b8c1f190da53bb090"

RPROVIDES:${PN} += "python3-dbus-fast \
python3.13dist-dbus-fast \
python313-dbus-fast \
python3dist-dbus-fast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
