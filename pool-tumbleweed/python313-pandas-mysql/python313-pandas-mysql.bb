SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-mysql-3.0.5-2.2.noarch.rpm"
RPM_HASH = "0c41299fe84b519cb15996f5b07988df3eef925ea438718a1a7efca31923fe4a6bfb300f888aa2427c7566992bb1405faffc5ab21b6e62ee3d19d37a03957fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-mysql \
python313-pandas-mysql"

RDEPENDS:${PN} += "python313-PyMySQL \
python313-SQLAlchemy \
python313-pandas"

inherit rpm
