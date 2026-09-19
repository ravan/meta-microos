SUMMARY = "Logos for openSUSE Tumbleweed"
DESCRIPTION = "Logos for openSUSE Tumbleweed"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-Tumbleweed-20250203-2.2.noarch.rpm"
RPM_HASH = "fd8e72077a2756a8958b6d1b3044da38f856fe7999896ede2454f1122ef47e27916b317d4cc3eefe2d4e78eb1bf35f7f97d0a4c2c66e944f8b5909f105e7c6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Tumbleweed"

RDEPENDS:${PN} += ""

inherit rpm
