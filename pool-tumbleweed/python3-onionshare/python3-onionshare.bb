SUMMARY = "Self-hosting Tor Onion Service based file sharing"
DESCRIPTION = "OnionShare lets the user share files securely and anonymously. It \
works by starting a web server, making it accessible as a Tor Onion \
Service, and generating an unguessable URL to access and download the \
files. It does not require setting up a separate server or using a \
third party file-sharing service. Files are hosted on the machine the \
program is run on. The receiving user just needs to open the URL in \
Tor Browser to download the file."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.4"

RPM_NAME = "python3-onionshare-2.6.4-2.1.noarch.rpm"
RPM_HASH = "0bfdfd148df6d925425d4bc6cac4c5df6b1b83e779a68dd3d9ac1dbd67b3c98ac1427bb98c28a18a7cd7300b5943cde2f994c0b49ca2c8810bfead5791d5e0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-onionshare \
python3-onionshare-cli \
python3.13dist-onionshare \
python3.13dist-onionshare-cli \
python3dist-onionshare \
python3dist-onionshare-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Cython \
python3-Flask \
python3-Flask-Compress \
python3-Flask-SocketIO \
python3-PyNaCl \
python3-PySocks \
python3-Unidecode \
python3-Werkzeug \
python3-cepa \
python3-click \
python3-colorama \
python3-eventlet \
python3-gevent \
python3-gevent-websocket \
python3-packaging \
python3-psutil \
python3-pyside6 \
python3-python-gnupg \
python3-qrcode \
python3-requests \
python3-setuptools \
python3-urllib3 \
python3-waitress \
python3-wheel \
tor"

inherit rpm
