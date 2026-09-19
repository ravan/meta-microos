SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "python313-fedora-messaging-3.9.1-1.1.noarch.rpm"
RPM_HASH = "73f328c644751b18f86e57d1bcea5063142590484d47e864124cb6af9f75dfba97f638cf5aa27f11a7e77dc83f97024e7466359205c33fb202fd28cb45ecd45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fedora-messaging \
python3.13dist-fedora-messaging \
python313-fedora-messaging \
python3dist-fedora-messaging"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Twisted \
python313-blinker \
python313-click \
python313-crochet \
python313-jsonschema \
python313-pika \
python313-pyOpenSSL \
python313-pytz \
python313-requests \
python313-service-identity \
python313-setuptools \
python313-tomli \
update-alternatives"

inherit rpm
