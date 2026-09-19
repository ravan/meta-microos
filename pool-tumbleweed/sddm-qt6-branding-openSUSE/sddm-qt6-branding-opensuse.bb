SUMMARY = "Plasma 6 branding for SDDM"
DESCRIPTION = "This package confirms defaults for SDDM suitable for Plasma 6."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "sddm-qt6-branding-openSUSE-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "1565a7ee3f61b9b2772b14739ec6d0f4e70244ac9fcb0aeb97a1ffaedb910c60cb6778f151cb2e9aea31d359690ef79b0d9ecda1ac24bf5b991e60e725113773"

RPROVIDES:${PN} += "sddm-qt6-branding-openSUSE"

RDEPENDS:${PN} += "plasma6-sddm-theme-openSUSE \
sddm-greeter-qt6"

inherit rpm
