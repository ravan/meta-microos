SUMMARY = "Agama support for running user-defined scripts"
DESCRIPTION = "The Agama installer supports running user-defined scripts during and after the installation. This \
package contains a systemd service to run scripts when booting the installed system."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-scripts-24+0.a836cced5-54.1.aarch64.rpm"
RPM_HASH = "29497fd293a842c09fc33cc27b01ac03e005839d205fb85a622c84c621976914584b59b0fe501ef2dd0b90a7185cd32d68f31c0d436bb4398fd019fe5ae2f47b"

RPROVIDES:${PN} += "agama-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
