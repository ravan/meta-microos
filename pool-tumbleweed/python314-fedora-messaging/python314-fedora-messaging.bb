SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "python314-fedora-messaging-3.9.1-1.1.noarch.rpm"
RPM_HASH = "a0d5bd38baf04149c89a122a7700ed7f944403a1c930afd5127500b451842f315c447a946b1bf295c4092d27c0596878d24756444b50c95a2add55509c113111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fedora-messaging \
python314-fedora-messaging \
python3dist-fedora-messaging"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Twisted \
python314-blinker \
python314-click \
python314-crochet \
python314-jsonschema \
python314-pika \
python314-pyOpenSSL \
python314-pytz \
python314-requests \
python314-service-identity \
python314-setuptools \
python314-tomli \
update-alternatives"

inherit rpm
