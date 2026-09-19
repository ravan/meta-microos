SUMMARY = "Redirect connection through proxy servers"
DESCRIPTION = "ProxyChains NG is based on ProxyChains. \
 \
ProxyChains NG hooks network-related (TCP only) libc functions in dynamically \
linked programs via a preloaded DSO (dynamic shared object) and redirects the \
connections through one or more SOCKS4a/5 or HTTP proxies. \
 \
Since Proxy Chains NG relies on the dynamic linker, statically linked binaries \
are not supported. \
 \
Adjust ~/.proxychains/proxychains.conf for your Proxy and use ProxyChains NG \
with \
 \
    proxychains4 application"
LICENSE = "GPL-2.0-only"

PV = "4.17"

RPM_NAME = "proxychains-ng-4.17-1.9.aarch64.rpm"
RPM_HASH = "eda0d6ed640c939df180e2b20d8e003c39547d1025fc82e68c9550f2babaf5d3b710bceacac55024d0deb88a64dbe85d39e7571736778090999f7668f6519f53"

RPROVIDES:${PN} += "config-proxychains-ng \
libproxychains4.so \
proxychains \
proxychains-ng"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
