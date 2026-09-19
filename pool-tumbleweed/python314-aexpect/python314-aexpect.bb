SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "python314-aexpect-1.8.0-1.2.noarch.rpm"
RPM_HASH = "27465e08c9706fe9fc20f60144da7451a153b9efcda0b3fdfbc5cc717458e7776a069a60d30659331db320237ac97d6acc92fd52895111ae7a76a90654c9c78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aexpect \
python314-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
