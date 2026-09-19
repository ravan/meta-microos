SUMMARY = "Leaper theme for LXQt"
DESCRIPTION = "openSUSE-leaper for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-leaper-0.1-2.22.noarch.rpm"
RPM_HASH = "e2a1e023a8369bc0adb5c4f115b30989d64ce956b199e01c53dbcc2cbe286a7f1eb1f93af0c2ef3f9c424a9f391a5a8f6e87e0fc3a63234598b8e82d86b6d1c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-leaper"

RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
