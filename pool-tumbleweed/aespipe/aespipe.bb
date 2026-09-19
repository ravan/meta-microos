SUMMARY = "AES Encrypting/Decrypting Pipe"
DESCRIPTION = "aespipe program is AES encrypting or decrypting pipe. It reads from standard \
input and writes to standard output. It can be used to create and restore \
encrypted tar or cpio archives. It can be used to encrypt and decrypt loop-AES \
compatible encrypted disk images."
LICENSE = "GPL-2.0-only"

PV = "2.4j"

RPM_NAME = "aespipe-2.4j-1.3.aarch64.rpm"
RPM_HASH = "8f4e4e37d20864124e40574231338c9a412fa429311832f79216933ef2552e6f87a6485b9c7340a4032a8f36506ee495e43a313ad7887ec2268ba910f4a2dcc1"

RPROVIDES:${PN} += "aespipe"

RDEPENDS:${PN} += "/usr/bin/sh \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
