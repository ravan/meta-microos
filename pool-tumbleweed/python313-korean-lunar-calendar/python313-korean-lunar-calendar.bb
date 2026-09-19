SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-korean-lunar-calendar-0.3.1-2.5.noarch.rpm"
RPM_HASH = "ee9a78c48420139a6ab3360596ac42dbd34d393d321c4642737b517f822a03efe988f55cdf90945cb4181db009052083d48a7be8a68f928e6f738c0b299d76bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-korean-lunar-calendar \
python3.13dist-korean-lunar-calendar \
python313-korean-lunar-calendar \
python3dist-korean-lunar-calendar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
