SUMMARY = "Python 3 utility libraries for Ceph"
DESCRIPTION = "This package contains data structures, classes and functions used by Ceph. \
It also contains utilities used for the cephadm orchestrator."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-ceph-common-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "1a2bedc75db8753b03cc9ecaafbd677b429c3048102544d53b30fe8cde0e22a4ba556e3b32545dc24f06d8dd05f3e9de50683c91bf788c63af4471f0b6281cbf"

RPROVIDES:${PN} += "python3-ceph-common \
python3.13dist-ceph \
python3dist-ceph"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML"

inherit rpm
