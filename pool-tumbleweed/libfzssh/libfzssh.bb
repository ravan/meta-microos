SUMMARY = "A C++ SSH/SFTP library based on libfilezilla"
DESCRIPTION = "fzssh is a SSH/SFTP library based on libfilezilla."
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "libfzssh-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "27a2ab8180f80798b4f47f034b9b9207a819c7d0406773e9ba7af74a73fc0a7b51148ea5f2e3a69b4c82bc081ea3c969dc1cdc060f200c7b56a3762669efdff4"

RPROVIDES:${PN} += "libfzssh"

RDEPENDS:${PN} += ""

inherit rpm
