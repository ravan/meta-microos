SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use bash as /bin/sh implementation."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-sh-5.3.15-8.2.noarch.rpm"
RPM_HASH = "fda85f76d07e7898818bacd77e5dbdab04d5d4867abff7e2a43e5210434fdd5b2c4a6fd7565a2eee4d5f260f8adb5d0d0e63b7d1d3c2328a9a518dac330f7ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
bash-/usr/bin/sh \
bash-sh"

RDEPENDS:${PN} += "bash"

inherit rpm
