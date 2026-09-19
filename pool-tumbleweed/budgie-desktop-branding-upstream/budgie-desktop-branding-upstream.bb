SUMMARY = "Upstream branding of the Budgie Desktop Environment"
DESCRIPTION = "This package provides the upstream look and feel for the Budgie \
desktop environment."
LICENSE = "CC-BY-NC-SA-4.0"

PV = "20250305.1"

RPM_NAME = "budgie-desktop-branding-upstream-20250305.1-2.4.noarch.rpm"
RPM_HASH = "8ad6cc017d9b991556408b33493f29318feeef731eab37a145bcf3d38ffd4f11fa00529216ed27426ade80d212b9aaf0139914c6ee3b593bdbe183481d8cf67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-branding \
budgie-desktop-branding-upstream"

RDEPENDS:${PN} += "adwaita-icon-theme \
budgie-desktop \
lightdm-slick-greeter \
materia-gtk-theme \
papirus-icon-theme"

inherit rpm
