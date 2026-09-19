SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-pyftpdlib-2.2.0-2.2.noarch.rpm"
RPM_HASH = "33d18c6a336a523c1f58c784798f957de00d9bf1722335a4cc1bffbeaac99a4e7e1c2c5605f7cdd4e21b5c1cb48b888b4ef33faf93b19f563551cf6e04b4bd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyftpdlib \
python314-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pyOpenSSL \
python314-pyasynchat \
python314-pyasyncore"

inherit rpm
