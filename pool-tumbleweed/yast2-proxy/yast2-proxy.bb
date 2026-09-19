SUMMARY = "YaST2 - Proxy Configuration"
DESCRIPTION = "This package contains the YaST2 component for proxy configuration."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-proxy-5.0.1-1.2.noarch.rpm"
RPM_HASH = "6b82396ef68f9006165d07aa815c38b01262a8b31a0c0ae3bb8d9027d0c5e0312f7b5cd5e5967231a0eaec20a86c74b5785f7ba5b0b512681efe50079174cf0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-proxy"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
