SUMMARY = "Development files for python314-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python314-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "27.2.0"

RPM_NAME = "python314-pyzmq-devel-27.2.0-1.1.aarch64.rpm"
RPM_HASH = "ead4375cfc453455df6a21dd61c9e6ad16289e35e94af592a535f07ef35183c40bfe476f93bf2e97426b7c21e4637a2b0d0da2f39de1cba0e3140bf3afc71c15"

RPROVIDES:${PN} += "python314-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python314-devel \
python314-pyzmq \
zeromq-devel"

inherit rpm
