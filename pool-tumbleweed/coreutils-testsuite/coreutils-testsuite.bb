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

RPM_NAME = "coreutils-testsuite-9.11-5.1.aarch64.rpm"
RPM_HASH = "8928162e7df564e4fd92564ddc0804cff0fddf23a54487aea71973bb37f0664a83ddc31ee9e8f8ee3ab182676f4b8d9ba084a5224b5cd866f444b4ab0cfe2e10"

RPROVIDES:${PN} += "coreutils-testsuite"

RDEPENDS:${PN} += ""

inherit rpm
