SUMMARY = "SLE Specific Customization of systemd defaults"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "systemd-default-settings-branding-SLE-0.10-1.7.noarch.rpm"
RPM_HASH = "3827987ce3d88c575d3dbd26190f3f9c927cd112ebcb5111df04f1168dd07f44a71eaa4876b7699c26222812ce520f32f880e97b75245ea996a74f912e2e8472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-SLE"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
