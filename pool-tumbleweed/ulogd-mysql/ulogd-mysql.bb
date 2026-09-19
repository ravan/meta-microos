SUMMARY = "MySQL output target for ulogd"
DESCRIPTION = "MySQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-mysql-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "6cdf8b6f316a3835515d06c098fa5afe8fbcc914ffb6a6f6c0fbe4761cb1fb394ca0d03a31904edabc1df5d5af68eabfaa14bdef302096292bc3b1feb6a8279e"

RPROVIDES:${PN} += "ulogd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
ulogd"

inherit rpm
