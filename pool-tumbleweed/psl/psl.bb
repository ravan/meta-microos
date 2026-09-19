SUMMARY = "Commandline utility to explore the Public Suffix List"
DESCRIPTION = "This package contains a commandline utility to explore the Public Suffix List, \
for example it checks if domains are public suffixes, checks if cookie-domain \
is acceptable for domains and so on. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site."
LICENSE = "MIT"

PV = "0.23.3"

RPM_NAME = "psl-0.23.3-1.1.aarch64.rpm"
RPM_HASH = "93236f53a725f949b3f192d5b3587e1f7b73bc06296f39b05b84350929067d13358487ffbf0ce4f9d715710473e0314bed5b9e4820b9e41fe97d0d218fdb84d3"

RPROVIDES:${PN} += "psl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpsl.so.5"

inherit rpm
