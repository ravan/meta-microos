SUMMARY = "Dracut integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis at early boot."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-dracut-21-1.6.aarch64.rpm"
RPM_HASH = "71d935c4e4e3868f763b5f5d0d3d73214829623df8dce072d49c2ea4f434a6d2a9080844609bba05a1ea04a0e1205c872b2e29285f30884a7149b32074f4987a"

RPROVIDES:${PN} += "clevis-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut"

inherit rpm
