SUMMARY = "Alternative FastCGI module for Apache2"
DESCRIPTION = "A binary compatibile alternative to the Apache module mod_fastcgi. \
 \
The module implements an efficient process pool management for external \
CGI program invocation. The pool of CGI programs is mapped against the \
pool of apache workers in such way that there is always a weighted number \
of programs waiting for requests in the pool. \
 \
To load the module into Apache, run the command 'a2enmod fcgid' as \
root. \
 \
See /etc/apache2/conf.d/mod_fcgid.conf and \
/usr/share/doc/packages/apache2-mod_fcgid for configuration."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.9"

RPM_NAME = "apache2-mod_fcgid-2.3.9-13.11.aarch64.rpm"
RPM_HASH = "12e6b13f2d0ccb90065773b0e9c7e9d0bb2b3f6f44bc3e8ef65c88e4f7d43ee9891a26abd30a4b801bef8a3c0bb186b1820d80e1d0c3d03955497db119f3c160"

RPROVIDES:${PN} += "apache2-mod-fcgid \
config-apache2-mod-fcgid"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
group-www \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0 \
user-wwwrun"

inherit rpm
