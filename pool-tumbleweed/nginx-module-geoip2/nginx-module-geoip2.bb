SUMMARY = "NGINX Maxmind GeoIP2 support"
DESCRIPTION = "Creates variables with values from the maxmind geoip2 databases based on the client IP (IPv4 or IPv6)."
LICENSE = "BSD-2-Clause"

PV = "3.4"

RPM_NAME = "nginx-module-geoip2-3.4-1.28.aarch64.rpm"
RPM_HASH = "7ba6dd46d8642aae7a523c5f846f188cddaebb609b3c9bd8f65370695fefff1a5fa9b37fb5ef134587e2d17a5f5e6038ed99b2c0be4a7c2925a28d772d5faf83"

RPROVIDES:${PN} += "nginx-/usr/lib64/nginx/modules/ngx-http-geoip2-module.so \
nginx-/usr/lib64/nginx/modules/ngx-stream-geoip2-module.so \
nginx-module-geoip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
nginx"

inherit rpm
