SUMMARY = "Loki: like Prometheus, but for logs"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation \
system inspired by Prometheus. \
 \
This package contains the Loki server."
LICENSE = "Apache-2.0"

PV = "3.7.7"

RPM_NAME = "loki-3.7.7-1.1.aarch64.rpm"
RPM_HASH = "e19a59097394b7fb3e100fd1b541d765c5cdeeded1d50085ce76966e59d1726617dc0451ec085b119cfa0304a55db97939c6ec30a6f854639a5e3f8df3bc7bd8"

RPROVIDES:${PN} += "config-loki \
loki"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-loki \
logcli \
user-loki"

inherit rpm
