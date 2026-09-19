SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+20260828.be794583"

RPM_NAME = "crmsh-test-5.1.0+20260828.be794583-1.1.noarch.rpm"
RPM_HASH = "3d3941f65af63c9ebb6e5ba9371a2ad602c63718c9d73e3c9ec1477170c6e1e0dd084bf01323fabe6e874a95987cf5e7b389279684e6672a328b7a59ec59c2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
crmsh"

inherit rpm
