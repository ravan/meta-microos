SUMMARY = "Random Saying"
DESCRIPTION = "Fortune displays a random text string from a set of files in a certain \
format. \
 \
This occurs each time you start a login shell. To get this feature just \
uncomment the respective lines in the user's .profile."
LICENSE = "BSD-4-Clause"

PV = "2.10.0"

RPM_NAME = "fortune-2.10.0-2.9.aarch64.rpm"
RPM_HASH = "323a5b1f60c19dc99bafd114eb5f62278c1e06ac8da970bedaeb1041244f0b5f0af8fbafea97fd5e15456e387aa0afa5bd70e1c9d3f817a2a9a0db4b15f80189"

RPROVIDES:${PN} += "fortune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librecode.so.3"

inherit rpm
