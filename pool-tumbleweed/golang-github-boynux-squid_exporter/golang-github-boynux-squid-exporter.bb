SUMMARY = "Squid Prometheus Exporter"
DESCRIPTION = "Exports squid metrics in Prometheus format"
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "golang-github-boynux-squid_exporter-1.13.0-4.6.aarch64.rpm"
RPM_HASH = "479725269927ac9a46e86fe8d4c6779456901cf0ae294f14a67c602fe2ebafd560f8abbc31c2e1fb6dbb7d2bc2a570be2c3aebee3c49e8d6c57c1c1f6376be22"

RPROVIDES:${PN} += "golang-github-boynux-squid-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
shadow"

inherit rpm
