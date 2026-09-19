SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python313-billiard-4.2.4-2.2.noarch.rpm"
RPM_HASH = "df462cc4492bf2e49a47403f1e17885f36b823f05a2cef378ba083d319ab6db521e60a3310a17663c459d3d6464470bef3304c7f31794b6bdfd57058d49f47d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-billiard \
python3.13dist-billiard \
python313-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
