SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.0"

RPM_NAME = "python314-paramiko-5.0.0-1.2.noarch.rpm"
RPM_HASH = "a6760590c2ff51a71b7b752180c25c528f654e25036bd75ec01be656d3be476e37cd17219ed2a5c9c6eed3f7b6d8c6cb4ebc970d81d480748d6c6e65b5bb7933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-paramiko \
python314-paramiko \
python3dist-paramiko"

RDEPENDS:${PN} += "python-abi \
python314-PyNaCl \
python314-bcrypt \
python314-cryptography"

inherit rpm
