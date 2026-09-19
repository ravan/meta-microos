SUMMARY = "A Secret Service provider"
DESCRIPTION = "James Bond went on a new mission and this time as a Secret Service provider."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "oo7-0.4.3-2.8.aarch64.rpm"
RPM_HASH = "c8a15682e986daee5a9898a8265225e300111b8eeb3875c29a5a94a89cd96e455a802d2ad5b82044e4d097152b1ff4246bfc456b91efb89049ab10b966a3006a"

RPROVIDES:${PN} += "oo7"

RDEPENDS:${PN} += "oo7-daemon \
oo7-portal"

inherit rpm
