SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-mysql-3.0.5-2.2.noarch.rpm"
RPM_HASH = "a42f4a74933b1a6d780a4d0b8349e2dd4f728a0479af5c6897d384b1092193ea51e72b63d531d5ee6a9add6874b1f3554ab7a52c296875b865713134abb4c411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-mysql"

RDEPENDS:${PN} += "python314-PyMySQL \
python314-SQLAlchemy \
python314-pandas"

inherit rpm
