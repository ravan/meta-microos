SUMMARY = "A Common Lisp Interpreter"
DESCRIPTION = "Common Lisp is a high-level, all-purpose programming language. CLISP is \
an implementation of Common Lisp that closely follows the book 'Common \
Lisp - The Language' by Guy L. Steele Jr. This package includes an \
interactive programming environment with an interpreter, a compiler, \
and a debugger.  Start this environment with the command 'clisp'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.49.95"

RPM_NAME = "clisp-2.49.95-1.10.aarch64.rpm"
RPM_HASH = "9cd8bffca5b3c1d73ea2637907b0395046e4d97641def7255a010305b249bf8fa6ce30dfd941e8f214958c80098cec121df074264c4fbe38842c6a92fb25d98b"

RPROVIDES:${PN} += "clisp \
clisp-devel \
lib-bdb.so \
lib-clx.so \
lib-dbus.so \
lib-fastcgi.so \
lib-gdbm.so \
lib-gtk.so \
lib-libsvm.so \
lib-linux.so \
lib-pari.so \
lib-postgresql.so \
lib-queens.so \
lib-rawsock.so \
lib-zlib.so"

RDEPENDS:${PN} += "/usr/bin/gzip \
/usr/bin/sh \
ffcall \
libX11.so.6 \
libXau.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libdb-4.8.so \
libdbus-1.so.3 \
libfcgi.so.0 \
libffcall.so.0 \
libgdbm.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpari-gmp-tls.so.9 \
libpq.so.5 \
libreadline.so.8 \
libsigsegv.so.2 \
libsvm.so.4 \
libtinfo.so.6 \
libz.so.1 \
vim \
vim-data"

inherit rpm
