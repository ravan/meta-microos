SUMMARY = "Conky Configuration File Support for nano"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in nano."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.24.2"

RPM_NAME = "nano-plugin-conky-1.24.2-1.1.noarch.rpm"
RPM_HASH = "007899fa49c8f112cb885ec8488bfb10c56aa16011f5595e8ad7cb8efc08a68e30a27090e85ce9c42f34b4a4676f157277429e39fe10da01cd5ea43c6cd35b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conky-nano \
nano-plugin-conky"

RDEPENDS:${PN} += ""

inherit rpm
