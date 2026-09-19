SUMMARY = "Check operability of computer hardware and find drivers"
DESCRIPTION = "A tool to check operability of computer hardware and upload result \
to the Linux hardware database. \
 \
Probe — is a snapshot of your computer hardware state and system \
logs. The tool checks operability of devices by analysis of logs \
and returns a permanent url to view the probe of the computer. \
 \
The tool is intended to simplify collecting of logs necessary for \
investigating hardware related problems. Just run one simple \
command in the console to check your hardware and collect all the \
system logs at once: \
 \
    sudo -E hw-probe -all -upload \
 \
By creating probes you contribute to the HDD/SSD Real-Life \
Reliability Test study: https://github.com/linuxhw/SMART"
LICENSE = "BSD-4-Clause & LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "hw-probe-1.6.5-1.9.noarch.rpm"
RPM_HASH = "378002c3c1c5a0d79817ff3d6d232950e8035b8f78bd314dfdcbf92a8a7ea6ba0a73bd2570f4f7ce289b41ba45d694efde5d16b6808263e7c7fd8877864b1da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hw-probe"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
acpica \
curl \
dmidecode \
hdparm \
hwinfo \
lsb-release \
pciutils \
perl-libwww-perl \
sensors \
smartmontools \
sysstat \
usbutils \
util-linux"

inherit rpm
