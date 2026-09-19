SUMMARY = "Daemon to execute actions on ACPI events"
DESCRIPTION = "ACPID is a flexible, extensible daemon for delivering ACPI events. It \
listens to a file (/proc/acpi/event) and, when an event occurs, \
executes programs to handle the event. The start script loads all \
needed modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.34"

RPM_NAME = "acpid-2.0.34-3.9.aarch64.rpm"
RPM_HASH = "6a534beb375b717471a0e4fa8f22371644a0b94323eec5165c73fc600e7b162c8d205635a27ce521672dfdc7b77feefbc50d2739e7e6f46f45f80f31d2dd43df"

RPROVIDES:${PN} += "acpid \
config-acpid"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
