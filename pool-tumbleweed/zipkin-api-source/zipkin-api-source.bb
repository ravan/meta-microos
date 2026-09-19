SUMMARY = "Source code of zipkin-api"
DESCRIPTION = "This package contains source code of zipkin-api"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "zipkin-api-source-0.2.2-1.17.noarch.rpm"
RPM_HASH = "d5306f9138c0877d3bce649dcb62ea1c26cd8515fbc0836195ab1ee277dc412b190a654593cd2e39f084cfc6a0d6c94170f3f0ab6559ac0883f6e73f3222533b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zipkin-api-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
