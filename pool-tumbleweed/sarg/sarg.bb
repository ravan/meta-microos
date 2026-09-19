SUMMARY = "Squid Analysis Report Generator"
DESCRIPTION = "Sarg -- Squid Analysis Report Generator is a tool that allows you to \
view 'where' your users are going to on the Internet. Sarg generate \
reports in html, with fields such as: users, IP Addresses, bytes, \
sites, and times."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "sarg-2.4.0-8.3.aarch64.rpm"
RPM_HASH = "f94eef37cb303b46b8395f668c226bb753321b1115d679ed90d59b4adb4564692b3f995d40bb1feeefc32a7d0602cd93c6e31cad7aeafc3766c03bead9102baf"

RPROVIDES:${PN} += "config-sarg \
sarg"

RDEPENDS:${PN} += "/usr/bin/sh \
group-squid \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgd.so.3 \
libldap.so.2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1 \
user-squid"

inherit rpm
