SUMMARY = "HTTP load generator, ApacheBench (ab) replacement"
DESCRIPTION = "hey is a tiny program that sends some load to a web application. \
 \
hey was originally called boom and was influenced from Tarek Ziade's tool at \
tarekziade/boom. Using the same name was a mistake as it resulted in cases \
where binary name conflicts created confusion. To preserve the name for its \
original owner, we renamed this project to hey."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "hey-0.1.5-1.7.aarch64.rpm"
RPM_HASH = "2aeeaf816d973fa7c1c1016f7685de95386ecff578f09141ee07323bea2d28ca7c631295e30345ba60bedaa9f335a51b648a30a7235adc583fb7e57814d57381"

RPROVIDES:${PN} += "hey"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
