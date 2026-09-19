SUMMARY = "CLI interface for RepRap"
DESCRIPTION = "Pronsole is a featured command line G-code sender. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0+73"

RPM_NAME = "pronsole-2.2.0+73-1.6.noarch.rpm"
RPM_HASH = "2f87c4d8e591574a230a41ef8a8408af2c203120b30fa56776291152d473ad02496822fb210700595885f32df3740f2a52e16e41c4d4d201911a1fce0d85efd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pronsole"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
Printrun-common"

inherit rpm
