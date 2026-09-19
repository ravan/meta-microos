SUMMARY = "Plugins for the Security and Monitoring Proxy Server"
DESCRIPTION = "This package contains the following plugins for the proxy server: \
* bitmap-filter \
* capture \
* demo \
* dyn-channel-dump"
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-proxy-plugins-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "3e5348ec606e071e18fd46784a77a5d3d8c04b15ee48e0d0a4a0c1479a2cbc12fae8c09a870c602f09f0e7a8a7522410c3439043ca5cf8ffec6326edeccb29f7"

RPROVIDES:${PN} += "freerdp-proxy-plugins \
libproxy-bitmap-filter-plugin.so \
libproxy-demo-plugin.so \
libproxy-dyn-channel-dump-plugin.so"

RDEPENDS:${PN} += "freerdp-proxy \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-server-proxy3.so.3 \
libfreerdp3.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwinpr3.so.3"

inherit rpm
