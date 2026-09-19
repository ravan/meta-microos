SUMMARY = "SLE-Micro Specific Customization of systemd defaults"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE-Micro distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "systemd-default-settings-branding-SLE-Micro-0.10-1.7.noarch.rpm"
RPM_HASH = "311bc906762dcfb1cddec8a2c95f829088c9e87554ef12b9188416f0b75b70cdac8ab3658014a4dce2d2a3194c80a5c34607e5e656a1a31822edf2d933113374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-SLE-Micro"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
