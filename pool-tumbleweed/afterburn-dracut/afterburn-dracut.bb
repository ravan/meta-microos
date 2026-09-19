SUMMARY = "Dracut modules for afterburn"
DESCRIPTION = "Dracut module that enables afterburn and corresponding services \
to run in the initramfs on boot."
LICENSE = "Apache-2.0"

PV = "5.10.0.git73.b97f772"

RPM_NAME = "afterburn-dracut-5.10.0.git73.b97f772-2.2.noarch.rpm"
RPM_HASH = "e7b3df493ee918f3e66fd29ff8bab3b1e72bcbc1b5c3a0dd14d927ada1a12a6558e9621770d9a9a27655b1629928c3954df1b73f3fd4732609bc8c211f193853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "afterburn-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
afterburn \
dracut"

inherit rpm
