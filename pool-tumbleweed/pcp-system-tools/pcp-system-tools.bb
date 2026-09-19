SUMMARY = "Performance Co-Pilot (PCP) System and Monitoring Tools"
DESCRIPTION = "This PCP module contains additional system monitoring tools written \
in python."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-system-tools-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "ce3c8c5df35f102ea76c46b2f4a522cdb10d49677c639fcafda022aa331f9a4c2a087bfb7922239c89ea844833246c70296a16cda600c29d56574a6b2bfc474a"

RPROVIDES:${PN} += "config-pcp-system-tools \
pcp-system-tools"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpcp-gui.so.2 \
libpcp.so.3 \
libtinfo.so.6 \
python3-pcp"

inherit rpm
