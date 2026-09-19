SUMMARY = "GNU Core Utilities"
DESCRIPTION = "These are the GNU core utilities.  This package is the union of \
the GNU fileutils, sh-utils, and textutils packages. \
 \
  [ arch b2sum base32 base64 basename basenc cat chcon chgrp chmod chown chroot \
  cksum comm cp csplit cut date dd df dir dircolors dirname du echo env expand \
  expr factor false fmt fold groups head hostid id install join \
  link ln logname ls md5sum mkdir mkfifo mknod mktemp mv nice nl nohup \
  nproc numfmt od paste pathchk pinky pr printenv printf ptx pwd readlink \
  realpath rm rmdir runcon seq sha1sum sha224sum sha256sum sha384sum sha512sum \
  shred shuf sleep sort split stat stdbuf stty sum sync tac tail tee test \
  timeout touch tr true truncate tsort tty uname unexpand uniq unlink \
  uptime users vdir wc who whoami yes"
LICENSE = "GPL-3.0-or-later"

PV = "9.11"

RPM_NAME = "coreutils-9.11-5.1.aarch64.rpm"
RPM_HASH = "d804ac7d8ee94915a0b78051da076a5406012c5890642c4571d7fe46fb462c425b4d897bdd1543b65039957f37f34d3f5bcf2b8352099fac1f46e43dc8dd6103"

RPROVIDES:${PN} += "/usr/bin/cat \
/usr/bin/chgrp \
/usr/bin/chmod \
/usr/bin/chown \
/usr/bin/cp \
/usr/bin/dd \
/usr/bin/df \
/usr/bin/echo \
/usr/bin/false \
/usr/bin/ln \
/usr/bin/ls \
/usr/bin/mkdir \
/usr/bin/mknod \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/pwd \
/usr/bin/rm \
/usr/bin/rmdir \
/usr/bin/sleep \
/usr/bin/sort \
/usr/bin/stty \
/usr/bin/sync \
/usr/bin/touch \
/usr/bin/true \
/usr/bin/uname \
coreutils \
fileutils \
libstdbuf.so \
mktemp \
sh-utils \
stat \
textutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libattr.so.1 \
libc.so.6 \
libcap.so.2 \
libgmp.so.10 \
libselinux.so.1"

inherit rpm
