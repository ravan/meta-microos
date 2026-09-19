SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Header files for library for reading PhotoCD images."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libpcd-devel-1.0.1-10.7.aarch64.rpm"
RPM_HASH = "142094f5271d6ab6f2ad6e45bc82d4e2f2d31f907eec2ccb6681d82041832773cdda525a781a1b5a60c2b9fe9314e059afa949e8f309674600bac6d4b18c0390"

RPROVIDES:${PN} += "libpcd-devel"

RDEPENDS:${PN} += "libpcd2"

inherit rpm
