SUMMARY = "Intelligent WHOIS client"
DESCRIPTION = "This package provides a commandline client for the WHOIS (RFC 3912) \
protocol, which queries online servers for information such as contact \
details for domains and IP address assignments. \
It can intelligently select the appropriate WHOIS server for most queries. \
 \
The package also contains mkpasswd, a features-rich front end to the \
password encryption function crypt(3)."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.6"

RPM_NAME = "whois-5.6.6-1.5.aarch64.rpm"
RPM_HASH = "26560a1e2ddb0a28dee49bd7f5f48ee1ba0a9d10789925195b71850ca636f2c214109326b2d5db95f7cf74aa791a03fa38c641e7e50a9a028c9220274d626813"

RPROVIDES:${PN} += "ripe-whois-tools \
whois"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
