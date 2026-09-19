SUMMARY = "Grep-Like Text Finder"
DESCRIPTION = "ack is a grep-like tool tailored to working with large trees of source code."
LICENSE = "Artistic-2.0"

PV = "3.10.0"

RPM_NAME = "ack-3.10.0-1.3.noarch.rpm"
RPM_HASH = "91db04ed90fdf1cda311a912cc74c939bd773dcde9364531d489371631c6c02f1c8176da630395d2951ff927a2be3f050e3f9e8503d238fd9c0923dcbe41d8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ack"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-App-Ack \
perl-base"

inherit rpm
