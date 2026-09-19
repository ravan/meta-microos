SUMMARY = "Core git tools"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
These are the core tools with minimal dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-core-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "f4ce1ea411cde314cc8767b36e5f31b1311249fa13ec2e008f1f8f30f51108e4bace2b4efbca83f78bca1a70d171b122e2dfae5aaefe4c27d059739786157fd6"

RPROVIDES:${PN} += "git-core"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/less \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libpcre2-8.so.0 \
libsha1detectcoll.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
