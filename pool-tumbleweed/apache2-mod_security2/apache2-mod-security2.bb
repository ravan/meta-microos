SUMMARY = "Web Application Firewall for Apache httpd"
DESCRIPTION = "ModSecurity is an intrusion detection and prevention \
engine for web applications (or a web application firewall). Operating \
as an Apache Web server module or standalone, the purpose of \
ModSecurity is to increase web application security, protecting web \
applications from known and unknown attacks."
LICENSE = "Apache-2.0"

PV = "2.9.12"

RPM_NAME = "apache2-mod_security2-2.9.12-1.8.aarch64.rpm"
RPM_HASH = "2d0822c525e34cc6a645731ec2b63833acb4b297dd353beebfb68d81bcc01517b6c48a8a5f0b26b819338d3290bb3556c55ed532fabe7a70a94e3793ca891907"

RPROVIDES:${PN} += "apache2-mod-security2 \
config-apache2-mod-security2"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcurl.so.4 \
liblua5.3.so.5 \
libpcre2-8.so.0 \
libxml2.so.16 \
suse-maintenance-mmn-0"

inherit rpm
