SUMMARY = "Dracut module to import PCR signatures"
DESCRIPTION = "Dracut module to import PCR signatures.  This will make possible the \
prediction of the initrd (and cmdline) hashes, as will not require the \
update of the initrd to introduce the JSON and PEM files required to \
unlock the LUKS2 device via systemd-cryptsetup."
LICENSE = "GPL-2.0-or-later"

PV = "0.8+0"

RPM_NAME = "dracut-pcr-signature-0.8+0-1.1.noarch.rpm"
RPM_HASH = "068818fc514cf7325c47d24754663535eb4960d07fc3aed07df6937fb16aeff48dccdc134caf782648b14a8db9a12a3b5f68bd0fb8c61cee098d8fe6a022c7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-pcr-signature"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
