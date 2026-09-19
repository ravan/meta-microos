SUMMARY = "A WSGI interface for Python3 web applications in Apache"
DESCRIPTION = "The mod_wsgi adapter is an Apacheache module that provides a WSGI compliant \
interface for hosting Python based web applications within Apache. The \
adapter is written completely in C code against the Apache C runtime and \
for hosting WSGI applications within Apache has a lower overhead than using \
existing WSGI adapters for mod_python or CGI. \
 \
To load the module into Apache, run the command 'a2enmod wsgi' as root."
LICENSE = "Apache-2.0"

PV = "5.0.2"

RPM_NAME = "apache2-mod_wsgi-5.0.2-2.5.aarch64.rpm"
RPM_HASH = "a4dd36a3afc0fef12d58ba1bae4e0f6732f68e9ef324555e1359c643860c6f1f9dea831763f37064613d51ffaac69d2be755a93c6dffe3998756c9c22d8e9808"

RPROVIDES:${PN} += "apache2-mod-wsgi \
apache2-mod-wsgi-python3 \
mod-wsgi \
python3.13dist-mod-wsgi \
python3dist-mod-wsgi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
python-abi \
suse-maintenance-mmn-0"

inherit rpm
