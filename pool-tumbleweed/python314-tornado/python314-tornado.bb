SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.5.8"

RPM_NAME = "python314-tornado-6.5.8-17.17.noarch.rpm"
RPM_HASH = "54bc391ca8799e12c643321adf95005427127165f8d59b9babecc7226a808da387c2641b41fea6fc81be3de646ddf978e9ac75e780f2cb0b77ed908dda535262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-tornado"

RDEPENDS:${PN} += "python314-tornado6"

inherit rpm
