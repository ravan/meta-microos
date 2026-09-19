SUMMARY = "Spawn FastCGI applications independent of the webserver"
DESCRIPTION = "spawn-fcgi is used to spawn FastCGI applications independent of the webserver. \
 \
Authors: \
--------- \
    Jan Kneschke \
    Stefan Buehler"
LICENSE = "BSD-3-Clause"

PV = "1.6.4"

RPM_NAME = "spawn-fcgi-1.6.4-1.37.aarch64.rpm"
RPM_HASH = "614eb9ea37457b0a9e5a88698096d9dc41a2b55a2a7156a611bec364d5db340b1e1e7b79f1b07ed9acaff756edadf730b64211d8cf2b5bd77b03ab2b4e79903c"

RPROVIDES:${PN} += "spawn-fcgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
