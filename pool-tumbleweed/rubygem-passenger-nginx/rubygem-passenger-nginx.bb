SUMMARY = "Passenger Nginx module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the nginx sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.2.0"

RPM_NAME = "rubygem-passenger-nginx-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "bac7cc66e1b415fc923d558450ceb21f7de9f16061049732902d4384b9cfdbfeb768f1d2d29f2a5eec117bcfbb6ad5c4401514bc6933c18183aa9268d0f2d80d"

RPROVIDES:${PN} += "config-rubygem-passenger-nginx \
rubygem-passenger-nginx"

RDEPENDS:${PN} += "nginx \
rubygem-passenger"

inherit rpm
