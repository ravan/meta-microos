SUMMARY = "DEC VMS password hashing"
DESCRIPTION = "This module implements the 'SYS$HASH_PASSWORD' password hashing function \
from VMS (also known as 'LGI$HPWD'), and some associated VMS username and \
password handling functions. \
 \
The password hashing function is implemented in XS, with a hideously slow \
pure Perl backup version for systems that can't handle XS."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "perl-Authen-DecHpwd-2.7.0-1.8.aarch64.rpm"
RPM_HASH = "0dfd7a56894d2a69dca95ee264d9470a7377d9f418f6e79d24785a8279b31a87f5dd8484e80691fe3aa17527f35f01dbb7888290990073b30b7d8a00c0a5ab3d"

RPROVIDES:${PN} += "perl-Authen--DecHpwd \
perl-Authen-DecHpwd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Data--Integer \
perl-Digest--CRC \
perl-Scalar--String \
perl-parent"

inherit rpm
