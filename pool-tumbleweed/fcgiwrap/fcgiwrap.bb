SUMMARY = "FastCGI wrapper for CGI scripts"
DESCRIPTION = "fcgiwrap is a server for running CGI applications over FastCGI. \
It provides CGI support to Nginx (and other web servers \
that may need it). Apache and lighthttpd don't need it, as they spawn \
FastCGI workers on demand."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-1.1.0+18+g99c942c-3.23.aarch64.rpm"
RPM_HASH = "bb8ce7e576fafcbb4146a555af7705eb390bdf6644143ef38b1ee34fb3dcbf9512b35a40535145acf47d50ea0d21bd96cfcdc9b6895fd4e121a05a8e6f3d76b9"

RPROVIDES:${PN} += "fcgiwrap"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6 \
libfcgi.so.0 \
libsystemd.so.0 \
systemd"

inherit rpm
