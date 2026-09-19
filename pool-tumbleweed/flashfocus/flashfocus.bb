SUMMARY = "Focus animations for tiling window managers"
DESCRIPTION = "Focus animations for tiling window managers. Compatible with all X based window managers."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "flashfocus-2.9.0-1.2.noarch.rpm"
RPM_HASH = "8149aac1b033b8a4a006369d9ca0ff2a1107615d9c6f691d8f2a7713d6eeec9d711da68338d3a395bf7ac958bda2958754016fe2c556ba2a6e502a50107ee20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flashfocus \
python3.13dist-flashfocus \
python3dist-flashfocus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-cffi \
python3-click \
python3-marshmallow \
python3-xcffib \
python3-xpybutil"

inherit rpm
