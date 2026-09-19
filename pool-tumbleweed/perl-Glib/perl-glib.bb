SUMMARY = "Perl wrappers for the GLib utility and Object libraries"
DESCRIPTION = "This wrapper attempts to provide a perlish interface while remaining as \
true as possible to the underlying C API, so that any reference materials \
you can find on using GLib may still apply to using the libraries from \
perl. This module also provides facilities for creating wrappers for other \
GObject-based libraries. The SEE ALSO section contains pointers to all \
sorts of good information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3294"

RPM_NAME = "perl-Glib-1.3294-1.19.aarch64.rpm"
RPM_HASH = "dfe50f3a02ecbc006e8798bd7f812e9faefaf4507d5ee268024b29783c2614c4f5dab336964f8702e67632feaa9b2fc467f1ccd2d534519c3f44119f82d874a3"

RPROVIDES:${PN} += "perl-Glib \
perl-Glib--Bytes \
perl-Glib--CodeGen \
perl-Glib--Error \
perl-Glib--Flags \
perl-Glib--GenPod \
perl-Glib--Install--Files \
perl-Glib--MakeHelper \
perl-Glib--Object \
perl-Glib--Object---LazyLoader \
perl-Glib--Object--Property \
perl-Glib--Object--Property--ReadWrite \
perl-Glib--Object--Property--Readable \
perl-Glib--Object--Property--Writable \
perl-Glib--Object--Subclass \
perl-Glib--ParseXSDoc \
perl-Glib--Variant \
perl-MY"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
