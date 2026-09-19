SUMMARY = "Contributed scripts for sway"
DESCRIPTION = "Contributed scripts from sway package."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "sway-contrib-1.10.1-12.3.noarch.rpm"
RPM_HASH = "c2ee25b5ac6bbeb91512b03f7692ac9684356744bcab52fb0d248fdd5ccac8458a196b3eb2e199920e433634c46ebe2fd67eef8f7ea53f0d803051a14d398824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sway-contrib"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
grim \
jq \
python3-i3ipc \
slurp \
sway \
wl-clipboard"

inherit rpm
