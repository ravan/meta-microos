SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python314-visitor-0.1.3-2.5.noarch.rpm"
RPM_HASH = "b3eb3a7613d9d4c9931df6af660efe5c71c334de9885accfb68e9554010b496eceec62e88a4b4eee9abde3fd520dd28d92a61fa04d0571bf163a0736c9e5aa0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-visitor \
python314-visitor \
python3dist-visitor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
