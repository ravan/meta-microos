SUMMARY = "Deduplicating block based backup software"
DESCRIPTION = "Deduplicating block based backup software for ceph/rbd, \
image files and devices."
LICENSE = "LGPL-3.0-only"

PV = "0.17.0"

RPM_NAME = "benji-0.17.0-1.13.noarch.rpm"
RPM_HASH = "303e27c22d014da28e059a15fad2a67e02e6957f965e2c8b81ff968bb890ff41ed029087dd24ec42d8b615d39916aaaee55acf425cc76194bb68f7d0806cd655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "benji \
config-benji \
python3.13dist-benji \
python3dist-benji"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Cerberus \
python3-PrettyTable \
python3-alembic \
python3-argcomplete \
python3-colorama \
python3-dateutil \
python3-diskcache \
python3-psutil \
python3-pycryptodome \
python3-pyparsing \
python3-ruamel.yaml \
python3-semantic-version \
python3-setproctitle \
python3-shortuuid \
python3-sparse \
python3-sqlalchemy \
python3-structlog"

inherit rpm
