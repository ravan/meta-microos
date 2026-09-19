SUMMARY = "Tool to create and manage DPAA2"
DESCRIPTION = "restool is a user space application providing the ability to dynamically create and manage DPAA2 containers and objects from Linux."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "restool-2.3.1-2.17.aarch64.rpm"
RPM_HASH = "3cef655dd9e94a06ccb02f92d7fa1a7de8ac9dd2bba98f7a6d28b44ae806b7a46728d1b58a16a702a74924b93fa0a17da62783dbce89d30d8fb5c6f2cb89c2e6"

RPROVIDES:${PN} += "restool"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libm.so.6"

inherit rpm
