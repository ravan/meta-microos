SUMMARY = "Tool to build Unified Kernel Image"
DESCRIPTION = "This package provides ukify, a script that combines a kernel image, an initrd, \
with a command line, and possibly PCR measurements and other metadata, into a \
Unified Kernel Image (UKI)."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-ukify-261.2-1.2.noarch.rpm"
RPM_HASH = "f21ce80f80a6d59aa649e4b21b7494d88686feb3786adb59322bc0c6d6cf40606d09e25a417a92992cf462dd3afe973b8b5d4ee74e3c8a3aacedc199c0c534f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-ukify"

RDEPENDS:${PN} += "/usr/bin/env \
python3-cryptography \
python3-pefile \
systemd \
systemd-boot"

inherit rpm
