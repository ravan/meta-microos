SUMMARY = "Shared development files for python-nautilus"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python-nautilus-common-devel-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "7cb39b6108f75c0899c10c57d12280745b394d23aca3e66f7af5d05a76ce2308b8b5e2576a9b58fdb6942db6fe72ae336b6f6cec780335d3c5c5f197cb5b735b"

RPROVIDES:${PN} += "pkgconfig-nautilus-python \
python-nautilus-common-devel \
python313-nautilus-common-devel \
python314-nautilus-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-nautilus-devel"

inherit rpm
