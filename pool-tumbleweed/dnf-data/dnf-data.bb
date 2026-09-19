SUMMARY = "Common data and configuration files for DNF"
DESCRIPTION = "This package provides the common data and configuration files for DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.23.0"

RPM_NAME = "dnf-data-4.23.0-2.4.noarch.rpm"
RPM_HASH = "e7344e5c1ed3bd3a2eb044628c958e45b9cc509ae97168a960cd9e629aa6973fd06dd6fdacff1ee918f90f34ea3f7a2a5232c063202de4807aba973da28425ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dnf-data \
dnf-conf \
dnf-data"

RDEPENDS:${PN} += "/etc/dnf/dnf.conf \
/usr/bin/ln \
/usr/bin/sh"

inherit rpm
