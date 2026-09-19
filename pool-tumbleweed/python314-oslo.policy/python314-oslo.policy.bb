SUMMARY = "OpenStack Oslo Policy library"
DESCRIPTION = "The OpenStack Oslo Policy library. \
RBAC policy enforcement library for OpenStack."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python314-oslo.policy-6.0.0-1.1.noarch.rpm"
RPM_HASH = "0428584f7ffedbf07b52cbecc0f37c4a543ad8ceb6b1484950de600ed6cb9205fa574b76c980b455e0b5cf3634056e9b2b76dd120e61406618dd8bd35a595050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.policy \
python314-oslo.policy \
python3dist-oslo.policy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-defusedxml \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.serialization \
python314-oslo.utils \
python314-requests \
python314-stevedore"

inherit rpm
