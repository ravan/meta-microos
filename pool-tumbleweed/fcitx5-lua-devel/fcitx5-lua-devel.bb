SUMMARY = "Development files for fcitx5-lua"
DESCRIPTION = "This package provides development files for fcitx5-lua."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.15"

RPM_NAME = "fcitx5-lua-devel-5.0.15-1.5.aarch64.rpm"
RPM_HASH = "bc455efc2c036d476de77bc872ea7003d37c1e65193e528ef15319dca175f9cc3e138b2bf67346022a02179b8260a17bac36e435800eafcab57bc35710b2a6b9"

RPROVIDES:${PN} += "cmake-Fcitx5ModuleLuaAddonLoader \
fcitx5-lua-devel"

RDEPENDS:${PN} += "fcitx5-lua"

inherit rpm
