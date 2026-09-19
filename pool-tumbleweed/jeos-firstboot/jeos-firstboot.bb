SUMMARY = "Simple text based JeOS first boot wizard"
DESCRIPTION = "Simple text based JeOS first boot wizard that can be used instead \
of the line based one that is built into systemd."
LICENSE = "MIT"

PV = "1.5.9"

RPM_NAME = "jeos-firstboot-1.5.9-1.3.noarch.rpm"
RPM_HASH = "9b8ced581105911cc370fe0d796b5756ebb7a0333a3ed3f4a0c331d1c41daa7242238f3de7c2d198d05d7f1afa5aefd110b2e7a8221e771f31f30ac7205bedc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeos-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/findmnt \
/usr/bin/sh \
cracklib \
dialog \
iproute2 \
live-langset-data \
ssh-pairing \
systemd \
timezone"

inherit rpm
