SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt5-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "265e7f5ba03b928543861a5b2cb6cbb42a6dadd21f5eda5c6e12df02b76fdbb70df0adc83947f532e58df8f36e09b09da2e8e7b30c4e5fb9d705683b8e327845"

RPROVIDES:${PN} += "libqaccessibilityclient-qt5"

RDEPENDS:${PN} += ""

inherit rpm
