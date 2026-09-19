SUMMARY = "Dynamically create Perl language bindings"
DESCRIPTION = "Dynamically create Perl language bindings"
LICENSE = "LGPL-2.1-only"

PV = "0.52.0"

RPM_NAME = "perl-Glib-Object-Introspection-0.52.0-1.8.aarch64.rpm"
RPM_HASH = "3e8b6cec4619ed9e58fb6ffb6768de26b76ba3515d8241eba6d46629ebe26fd1fd043c16a489ffefe4cecebb6a94137ae550d912f3bc6e0a4d8abea56e227661"

RPROVIDES:${PN} += "perl-Glib--Object--Introspection \
perl-Glib-Object-Introspection"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
