SUMMARY = "Python dependency specifications supporting logical operations"
DESCRIPTION = "Python dependency specifications supporting logical operations. \
 \
This library allows logic operations on version specifiers and environment markers."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python314-dep-logic-0.7.1-1.1.noarch.rpm"
RPM_HASH = "21855035976f768742b417d5b298db6f2ae6812a339cc3ace01163f22edfce92e6e73b502e1722a07a4c9da7602912c7025c481ac050b73ab7aab0098837c4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dep-logic \
python314-dep-logic \
python3dist-dep-logic"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
