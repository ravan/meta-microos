SUMMARY = "MH mailbox format support for Mailutils"
DESCRIPTION = "The implementation provides an interface between Mailutils and Emacs \
using the mh-e module. \
 \
To use Mailutils MH with Emacs, add the following line to \
site-start.el or .gnu-emacs file: (load 'mailutils-mh')"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-mh-3.21-1.6.aarch64.rpm"
RPM_HASH = "0623619e2d5a969435cec5cb783dbf924d06694f275f770dcd15e5b877d63045e3d1ed308c038cf7fe5bea40a56efec19c1e5ff8561740f94364d9b8d0218dcc"

RPROVIDES:${PN} += "mailutils-mh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libmailutils.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mailer.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9 \
libmu-py.so.9 \
libmu-scm.so.9 \
libmu-sieve.so.9 \
libmuaux.so.9 \
libreadline.so.8 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
