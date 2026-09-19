SUMMARY = "openSUSE Tumbleweed branding for IceWM during the installation"
DESCRIPTION = "This IceWM theme is specifically tailored to the openSUSE installation \
process using YaST2"
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20240405"

RPM_NAME = "icewm-theme-yast-installation-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "6cdfaefe726a63d5ef09f3e61361d17a519f40b303a3861389c3550a0d456714c203cc5949d5285d11ec5dacccf888e774328ab205e40881df78bd0f2e45b60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icewm-theme-yast-installation \
icewm-theme-yast-installation"

RDEPENDS:${PN} += ""

inherit rpm
