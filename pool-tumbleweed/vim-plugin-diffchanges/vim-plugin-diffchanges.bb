SUMMARY = "Show changes since the last save"
DESCRIPTION = "Show changes made to current buffer since the last save. This plugin is based \
from an example in the Hacking Vim book. The differences are that this \
functionality is in the form of a plugin, is a bit more robust, and can be \
toggled."
LICENSE = "Vim"

PV = "0.6+g346dae2"

RPM_NAME = "vim-plugin-diffchanges-0.6+g346dae2-64.2.noarch.rpm"
RPM_HASH = "697c24d6375cc8835e50019ef2f0923fec04b50ec1bf04416b4674eac55b39d48625c69e9e7cd9cf7b3455d6dd64e0071a0ec85fdf79e6177fff682cadf0a71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-diffchanges"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
vim"

inherit rpm
