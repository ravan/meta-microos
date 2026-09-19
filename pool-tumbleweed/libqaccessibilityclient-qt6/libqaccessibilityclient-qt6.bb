SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt6-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "932a37a1b50fd11e23916c81da4bbaf5a8774797832a97c54569b22cafa8c256aa1819954e2737361f8b74cb2f870b839bcb3846e18054733afa2a1c2e7f8fc7"

RPROVIDES:${PN} += "libqaccessibilityclient-qt6"

RDEPENDS:${PN} += ""

inherit rpm
