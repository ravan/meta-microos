SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.5.8"

RPM_NAME = "python313-tornado-6.5.8-17.17.noarch.rpm"
RPM_HASH = "4bdc218095a9f524123311015030c08cc6e76afd0065827723757d8d9e49fe204f3f5bee30be458bc21034fe53bd31d9948b6ee8f1b845f487c9577c9afb81cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tornado \
python313-tornado"

RDEPENDS:${PN} += "python313-tornado6"

inherit rpm
