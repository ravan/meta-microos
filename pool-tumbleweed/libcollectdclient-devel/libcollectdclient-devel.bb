SUMMARY = "Development Environment for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients. \
This package contains the required development environment \
to write collectd unixsock clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "libcollectdclient-devel-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "bdb6f4115ad2b744fae5278333029af0313bad1f889ce6829e5ecb781ebf084331a77a665d230f10d69ca40f41fea80847b3d67c9399f5a9f28871100d56a393"

RPROVIDES:${PN} += "libcollectdclient-devel \
pkgconfig-libcollectdclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcollectdclient1"

inherit rpm
