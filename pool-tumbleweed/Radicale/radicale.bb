SUMMARY = "A CalDAV calendar and CardDav contact server"
DESCRIPTION = "Radicale is a server for CalDAV (calendars, to-do lists) and CardDAV (contacts). \
 \
* Shares calendars and contact lists through CalDAV, CardDAV and HTTP. \
* Supports events, todos, journal entries and business cards. \
* Works out-of-the-box, no setup or configuration required. \
* Can limit access by authentication. \
* Can secure connections with TLS. \
* Works with many CalDAV and CardDAV clients. \
* Stores all data on the file system in a directory structure. \
* Can be extended with plugins."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.8"

RPM_NAME = "Radicale-3.7.8-1.1.noarch.rpm"
RPM_HASH = "1716066aadddd78de860eff61ab767a13aea8aba5bce7e1689447c308d6b2391e060bd61f8e7234fbdf4c902fbce468f2e05414ef7f2cb3d2e39e53f31e6b468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Radicale \
config-Radicale \
group-radicale \
python3.13dist-radicale \
python3dist-radicale \
user-radicale"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3 \
python3-defusedxml \
python3-passlib \
python3-pika \
python3-requests \
python3-vobject \
sysuser-shadow"

inherit rpm
