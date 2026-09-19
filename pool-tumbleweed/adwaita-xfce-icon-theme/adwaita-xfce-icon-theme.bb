SUMMARY = "Icon theme for Xfce complementing Adwaita"
DESCRIPTION = "This icon theme is an extension for Adwaita fixing missing icons that are used in Xfce. \
It is not a complete theme and inherits the bulk of icons from Adwaita."
LICENSE = "GPL-2.0-only"

PV = "0.0.4+git0.b33d65a"

RPM_NAME = "adwaita-xfce-icon-theme-0.0.4+git0.b33d65a-1.7.noarch.rpm"
RPM_HASH = "1a731404f7a534cfa95196e41c26b4b2af33d056a7ad46668e1bb0187eb23e785114258586c313f5eca128ef906b594daf9fab9a89a215622f93a1901c0c734f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adwaita-xfce-icon-theme \
openSUSE-xfce-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme"

inherit rpm
