SUMMARY = "Test plugin for health-checker"
DESCRIPTION = "This package contains a script for testing the CaaSP health checker. \
It will report success or failures depending on previous states."
LICENSE = "GPL-2.0-only"

PV = "1.13+git20260414.bb3e4ad"

RPM_NAME = "health-checker-testing-1.13+git20260414.bb3e4ad-1.2.noarch.rpm"
RPM_HASH = "864f789b0ed7cc6e79bc924af5b8340b5bbe999ef5457e17b8cb7773d26966725a6164963b29eb7839d45b74f8c13252649d87215eaef63ba02c6c0da84427db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-testing"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm
