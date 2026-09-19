SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.0"

RPM_NAME = "python313-paramiko-5.0.0-1.2.noarch.rpm"
RPM_HASH = "517b2c44fc551694eff2944e0ba8aa29a756e6092a3c8966238ffd4d132f2885f87f9d636791db7dc69051baed98051eefff429ab363f3a8440f709f9e839c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko \
python3.13dist-paramiko \
python313-paramiko \
python3dist-paramiko"

RDEPENDS:${PN} += "python-abi \
python313-PyNaCl \
python313-bcrypt \
python313-cryptography"

inherit rpm
