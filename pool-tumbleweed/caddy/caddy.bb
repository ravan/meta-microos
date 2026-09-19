SUMMARY = "Fast, multi-platform web server with automatic HTTPS"
DESCRIPTION = "Caddy is a powerful, extensible platform to serve your sites, services, and \
apps, written in Go."
LICENSE = "Apache-2.0"

PV = "2.11.4"

RPM_NAME = "caddy-2.11.4-1.3.aarch64.rpm"
RPM_HASH = "63f50b00b15801d2c4f51506f4871e5f56c75fb5ec3cb41b8229a31e7492638d082f93f1b95081df17061d8b8447824c8c8e43ef597e1b0879022d364afbd2db"

RPROVIDES:${PN} += "caddy \
config-caddy \
group-caddy \
user-caddy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
systemd \
sysuser-shadow"

inherit rpm
