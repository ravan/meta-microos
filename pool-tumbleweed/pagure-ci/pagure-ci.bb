SUMMARY = "A CI service for pagure"
DESCRIPTION = "Pagure comes with a continuous integration service, currently supporting \
only jenkins but extendable to others. \
With this service, your CI server will be able to report the results of the \
build on the pull-requests opened to your project."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-ci-5.14.1-3.3.noarch.rpm"
RPM_HASH = "28bf3b2fada384d04200f9ef22af4746f523cffe5cbe1b9fc6833789e025838c16dab6eb65b644d410799cb1f4203a36953fa3bd5b6677b1b3f00e4314f66dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
python3-python-jenkins \
systemd"

inherit rpm
