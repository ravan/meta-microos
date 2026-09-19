SUMMARY = "uWSGI Module for Apache 2.0"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an Apache 2.0 module for uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "apache2-mod_uwsgi-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "6ae3cb770a364500e302db349f8907928b491543a3d9aa44cc2abf9dfa5afdce90820fda07ed14853ec9cb32193e6eb279d66c02f77c3a5dde135dac4168d9b1"

RPROVIDES:${PN} += "apache2-mod-uwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
