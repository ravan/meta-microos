SUMMARY = "openSUSE Tumbleweed Brand File"
DESCRIPTION = "This package contains the file /etc/SUSE-brand, and its name is used as \
a trigger for installation of correct vendor brand packages."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20240405"

RPM_NAME = "branding-openSUSE-84.87.20240405-5.5.aarch64.rpm"
RPM_HASH = "990e4105a3cd55341b326591defbf50877f76850f1a994e73d32f313e3917c07501253832fdf8cb7dbaaee21564a799c754528a2edf0e2ddef505420b5d0330d"

RPROVIDES:${PN} += "branding \
branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
