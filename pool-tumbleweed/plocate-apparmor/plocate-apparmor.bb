SUMMARY = "Apparmor profiles for plocate"
DESCRIPTION = "This package contains the files needed for apparmor support"
LICENSE = "GPL-2.0-only"

PV = "1.1.24"

RPM_NAME = "plocate-apparmor-1.1.24-1.3.noarch.rpm"
RPM_HASH = "7ce8c35071fd4440153751b332cb9f0f31db0daf83d55814cb936237c6adc832f36b9a58497090fa25fa81275f2ea822ed119077695f61f52db54ceea8fdcba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plocate-apparmor \
plocate-apparmor"

RDEPENDS:${PN} += "apparmor-abstractions \
plocate"

inherit rpm
