SUMMARY = "Open Source Next Generation Intrusion Detection and Prevention Engine"
DESCRIPTION = "The Suricata Engine is an Open Source Next Generation Intrusion Detection and \
Prevention Engine. This engine is not intended to just replace or emulate the \
existing tools in the industry, but will bring new ideas and technologies to \
the field. \
 \
OISF is part of and funded by the Department of Homeland Security's Directorate \
for Science and Technology HOST program (Homeland Open Security Technology), by \
the the Navy's Space and Naval Warfare Systems Command (SPAWAR), as well as \
through the very generous support of the members of the OISF Consortium. More \
information about the Consortium is available, as well as a list of our current \
Consortium Members."
LICENSE = "GPL-2.0-only"

PV = "8.0.6"

RPM_NAME = "suricata-8.0.6-1.3.aarch64.rpm"
RPM_HASH = "6df9f32f513d0c43586113b6b87bbce39aee0f4d5e234b83cd08a4e304cde095a2f43197a256112ede810995888efede55c1b30fb9f969b45ad21db90de46161"

RPROVIDES:${PN} += "config-suricata \
group-suricata \
suricata \
user-suricata"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libhiredis.so.1.3.0 \
libhs.so.5 \
libjansson.so.4 \
liblz4.so.1 \
libm.so.6 \
libmagic.so.1 \
libmaxminddb.so.0 \
libnet.so.9 \
libnetfilter-log.so.1 \
libnetfilter-queue.so.1 \
libnfnetlink.so.0 \
libpcap.so.1 \
libpcre2-8.so.0 \
libxdp.so.1 \
libyaml-0.so.2 \
libz.so.1 \
python3-PyYAML \
systemd \
sysuser-shadow"

inherit rpm
