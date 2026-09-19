SUMMARY = "Visual Interactive Taskwarrior full-screen terminal interface"
DESCRIPTION = "Visual Interactive Taskwarrior full-screen terminal interface. \
Features: \
 * Fully-customizable key bindings (default Vim-like) \
 * Uncluttered display \
 * No mouse \
 * Speed \
 * Per-column colorization \
 * Advanced tab completion \
 * Multiple/customizable themes \
 * Override/customize column formatters \
 * Intelligent sub-project indenting"
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vit-2.3.4-1.2.noarch.rpm"
RPM_HASH = "b03db9a960936745524305c6623676950a694b5049b9c73fd18c1c1d4aa824e245bf7577beeda9c1079628f2c96a82692b7f7b192a1f522c0c243b7e1fa2c257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-vit \
python3dist-vit \
vit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-base \
python3-tasklib \
python3-urwid \
taskwarrior"

inherit rpm
