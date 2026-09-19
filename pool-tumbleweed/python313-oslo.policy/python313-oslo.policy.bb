SUMMARY = "OpenStack Oslo Policy library"
DESCRIPTION = "The OpenStack Oslo Policy library. \
RBAC policy enforcement library for OpenStack."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python313-oslo.policy-6.0.0-1.1.noarch.rpm"
RPM_HASH = "728c8fb2904d0586efaf26e0d1d1f4a34ca4aa0bd10211dee406d872794bf0b507d17e4abfbf1bec5ddd7b2b4f1ad616e786b821932c142612eaeb8def2bc50d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.policy \
python3.13dist-oslo.policy \
python313-oslo.policy \
python3dist-oslo.policy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-defusedxml \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests \
python313-stevedore"

inherit rpm
