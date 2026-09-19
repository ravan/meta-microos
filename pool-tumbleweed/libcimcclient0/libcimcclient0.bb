SUMMARY = "CIM C Client Loader Implementation"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcimcclient0-2.2.9~rc1-1.11.aarch64.rpm"
RPM_HASH = "da6305d949ee49981cd460474454d919d6e80c1a71de819c69b01e952fb7c7e382a8132146dcf870959c1758753c43449eb8d8d62d990129b854cc063ce49fb4"

RPROVIDES:${PN} += "libcimcclient.so.0 \
libcimcclient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
