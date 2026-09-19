SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python313-pyusb-1.3.1-2.6.noarch.rpm"
RPM_HASH = "499fc099f3067ea5c6f55aefbfde60c8e262990c60a92b6e12014fbe1382cf194303f5994c57e38aa0932b998f37ee5dd6e8186f48d8fc1e19f03ece26941309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyusb \
python3-usb \
python3.13dist-pyusb \
python313-pyusb \
python313-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
