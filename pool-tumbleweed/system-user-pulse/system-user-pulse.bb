SUMMARY = "System user for PulseAudio"
DESCRIPTION = "System user for PulseAudio"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "system-user-pulse-17.0-7.5.noarch.rpm"
RPM_HASH = "c334566ab0016878fa86d8771a4ada2dfd13300c4dd322718b59f112b9cd03814ead6c7510b5d81baad6993d271acbfeedfadc052734ab78209d9061ca3245bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pulse \
group-pulse-access \
system-user-pulse \
user-pulse"

RDEPENDS:${PN} += "/usr/bin/sh \
group-audio \
sysuser-shadow"

inherit rpm
