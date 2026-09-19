SUMMARY = "Windows 'Registry Hive' extraction library"
DESCRIPTION = "Hivex is a library for extracting the contents of Windows 'Registry \
Hive' files. It is designed to be secure against buggy or malicious \
registry files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "hivex-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "fa6ab17f75728fc19b003fdbd14ab66068bb062b0b3c43731ef8cab2677e9d7fa236d12bcc3e730b0fd57eb6ebbf5faf47407f51049dfdce6b2f03d81fbe9038"

RPROVIDES:${PN} += "hivex"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
libxml2.so.16 \
perl-Getopt--Long \
perl-Pod--Usage \
perl-Win--Hivex \
perl-Win--Hivex--Regedit"

inherit rpm
