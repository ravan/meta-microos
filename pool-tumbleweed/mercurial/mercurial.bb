SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.4"

RPM_NAME = "mercurial-7.2.4-1.2.aarch64.rpm"
RPM_HASH = "5f70fce7987dc0ca464e34f45a2e3ed50b7720345ed48fc5d406ab621f465ffe8a15ba978fae315bb34a0bfd729c0204ed151371e5cfd6f13c55e5ba42610765"

RPROVIDES:${PN} += "config-mercurial \
hg \
mercurial \
python3.13dist-mercurial \
python3dist-mercurial"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
ca-certificates \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-curses \
python3-xml"

inherit rpm
