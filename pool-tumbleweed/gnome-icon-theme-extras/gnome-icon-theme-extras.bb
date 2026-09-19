SUMMARY = "GNOME Icon Theme Extras"
DESCRIPTION = "Extra GNOME icons for specific devices and file types."
LICENSE = "CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-extras-3.12.0-3.27.noarch.rpm"
RPM_HASH = "fc15e6533a9ea244d9d952ec07812feeb063373ad799503bb5c483b4bf76b933f915e7743dfca5275a475476f80942b093feb9ec09bab260b0a35b94fae6e22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
