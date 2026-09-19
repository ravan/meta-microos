SUMMARY = "Tests for the glib2 package"
DESCRIPTION = "The glib2-tests-devel package contains tests that can be used to verify \
the functionality of the installed glib2 package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-tests-devel-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "4393d2cdf76b91ffedeac2e04d8e5646e0bba02acbce8c353a09af9ab343bc54c451fc5fc547b801b9150dfe2395b562a71fe3e4cd59e7133ed4e155ba01c0ad"

RPROVIDES:${PN} += "glib2-tests \
glib2-tests-devel \
libgdbus-example-objectmanager.so \
libmoduletestplugin-a-library.so \
libmoduletestplugin-a-plugin.so \
libmoduletestplugin-b-library.so \
libmoduletestplugin-b-plugin.so \
libresourceplugin.so \
libtestmodulea.so \
libtestmoduleb.so"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
glib2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libm.so.6 \
libpcre2-8.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
