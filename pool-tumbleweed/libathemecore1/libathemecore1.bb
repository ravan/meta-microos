SUMMARY = "The Atheme IRC Services core library"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "libathemecore1-7.2.12-5.6.aarch64.rpm"
RPM_HASH = "931d99ce4029f3d3d7b1e0ccc9d38cce83fa6ec74c51d457c3c2d09f1199ebb52d32dc27bdf158f2403d453658ffcacc10e40e724d6d9068ec082ba3e4db3a34"

RPROVIDES:${PN} += "libathemecore.so.1 \
libathemecore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmowgli-2.so.0 \
libpcre2-8.so.0 \
libqrencode.so.4"

inherit rpm
