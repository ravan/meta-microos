SUMMARY = "GUI to query passwords on behalf of SSH agents"
DESCRIPTION = "lxqt-openssh-askpass is a GUI to query credentials on behalf of other \
programs. As indicated by its name it's primarily targeted at ssh-agent, \
the SSH agent of OpenSSH, but it works with other applications like e. g. \
EncFS as well."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-openssh-askpass-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "b24ee7d50e53ee3e627fe36f14806c33c49045cc0e6c23ad0f7b149424245517d96fe4d8e5e62ba770ea45b0d666efa18318c2942f7882c5d74f64d17168264d"

RPROVIDES:${PN} += "lxqt-openssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt.so.2 \
libstdc++.so.6"

inherit rpm
