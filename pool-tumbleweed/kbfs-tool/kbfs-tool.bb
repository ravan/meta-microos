SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "kbfs-tool-6.6.3-4.1.aarch64.rpm"
RPM_HASH = "3c36ef07a62333c64fc118cce01353cdb658cd71598d98d228bfb7216da59253668d660308485d283a51215ab6c1acfde255ace009337ff219ca1b4af266c619"

RPROVIDES:${PN} += "kbfs-tool"

RDEPENDS:${PN} += "keybase-client"

inherit rpm
