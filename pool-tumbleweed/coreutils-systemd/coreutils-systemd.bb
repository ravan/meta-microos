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

RPM_NAME = "coreutils-systemd-9.11-5.1.aarch64.rpm"
RPM_HASH = "710b07877a0799ceffb29a21d028102f5667a57e6b92a21011b0bf9d1891cb3ecc41ba736ee02e2f7305363324f0585a669428fc9913c68fa9b66b9da3987df4"

RPROVIDES:${PN} += "coreutils-/usr/bin/who \
coreutils-systemd"

RDEPENDS:${PN} += "coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
