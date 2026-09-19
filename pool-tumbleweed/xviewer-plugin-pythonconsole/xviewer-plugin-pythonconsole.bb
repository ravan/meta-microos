SUMMARY = "Xviewer pythonconsole plugin"
DESCRIPTION = "xviewer python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-pythonconsole-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "c24e1a0e2afd8c76fe0409a4913f598cb313d42922a2dd87093a3dd018c713b1b4a577048bc81e817e058b8acb0b9941b3f0cc200433ee46343ac41ef5f29186"

RPROVIDES:${PN} += "xviewer-plugin-pythonconsole"

RDEPENDS:${PN} += "xviewer-plugins-data"

inherit rpm
