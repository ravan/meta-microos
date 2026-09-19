SUMMARY = "Tool for scanning DVB transponders"
DESCRIPTION = "w_scan is a small command line utility used to perform frequency scans for \
DVB and ATSC transmissions. It is capable of creating channels.conf files \
(in different output formats !) as well as initial tuning data for scan. \
It's based on the utility scan from linuxtv-dvb-apps, but meanwhile it was \
heavily changed and has different features."
LICENSE = "GPL-2.0-only"

PV = "20210218"

RPM_NAME = "w_scan-20210218-1.3.aarch64.rpm"
RPM_HASH = "ee51512d6bffbf39565507fd07d80f675016d98dd04fd762a8365a6e407d90d5f9c63495facc310e38c56635c5c40824d5a02bfd0f4f4895d18bae0f1d1592bd"

RPROVIDES:${PN} += "w-scan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
