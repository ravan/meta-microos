SUMMARY = "Command-line ACPI client"
DESCRIPTION = "Linux ACPI client is a small command-line program that attempts to \
replicate the functionality of the 'old' apm command on ACPI systems. \
It includes battery and thermal information."
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "acpi-1.8-2.5.aarch64.rpm"
RPM_HASH = "ffd7f9b257a9558e6b22defb5ec9c1435d0c7aaf6945d1aa9386a5fbe13f3c774299c7cfd20bd46dda088f8beb67d6e107397a9fa2a9fc67b624e00db28f1f22"

RPROVIDES:${PN} += "acpi \
acpid-/usr/bin/acpi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
