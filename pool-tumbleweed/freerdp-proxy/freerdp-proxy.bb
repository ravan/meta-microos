SUMMARY = "Remote Desktop Security and Monitoring Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-proxy-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "08d57f6e73e7fcdcbd82393148ef61d77c001fbda82f2464150c3a81a3ce827054d0fcdbe209639170e38e621d9d81d793fc3de4b4b6ee05905b6e5333939c03"

RPROVIDES:${PN} += "freerdp-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-server-proxy3.so.3 \
libfreerdp3.so.3 \
libwinpr3.so.3"

inherit rpm
