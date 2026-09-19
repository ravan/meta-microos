SUMMARY = "Configuration for the Alpine mail client"
DESCRIPTION = "The package provides a system-wide configuration file for the Alpine \
text/ncurses mail client. This enables some features that would \
otherwise be disabled by default, including threading, additional \
keybindings, color, threading."
LICENSE = "WTFPL"

PV = "0"

RPM_NAME = "alpine-branding-openSUSE-0-5.25.noarch.rpm"
RPM_HASH = "168846d2aeabbd20734ccceedefe6a9c0a7b58ebab41d589d1831c93ffe695861b910f091b5febb1f36b09a96a93bb9ab62dc1731a2846b9f902310ca5241fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alpine-branding \
alpine-branding-openSUSE \
config-alpine-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
