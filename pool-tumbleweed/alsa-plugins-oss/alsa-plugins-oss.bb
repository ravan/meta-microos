SUMMARY = "Plug-Ins for ALSA Library to Access OSS Devices"
DESCRIPTION = "This package contains I/O and control plugins to access OSS devices \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-oss-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "e8348b131c18ae97f394a539fa5a07ecbcf59ba75dd36038a48700e89e74b942ec8f93afc5ba471a1652ec5bdd19d07205a7943da68b41ef0d2937f637ba10b4"

RPROVIDES:${PN} += "alsa-plugins-oss \
libasound-module-ctl-oss.so \
libasound-module-pcm-oss.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
