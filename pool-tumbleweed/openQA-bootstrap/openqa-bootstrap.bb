SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-bootstrap-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "a29ae954acde2ef9b521e5e2b2630328b1cdd60ed18469576ff33682424ff658ebd50b2845bf471b31a70877fb201d5753923221b4c7e0951fdadc826154b92e"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash \
curl \
iputils \
procps"

inherit rpm
