SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-python-scripts-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "cabb6bce8dfd540e234f3f33f6ba12089465575f79b917e212e0ca4592309f2ead3065162880174722156b683a78a3039b21a34e3e668316f59bda5c952cb5b9"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
