SUMMARY = "Python script to have a 'curse' compatible client for linux"
DESCRIPTION = "Python script to have a 'curse' compatible client for linux. \
 \
In this context curse refers to the curse.com addon database for World of \
Warcraft."
LICENSE = "Unlicense"

PV = "1.0.0"

RPM_NAME = "lcurse-1.0.0-1.25.noarch.rpm"
RPM_HASH = "62d8d343f8ab650b75928963e9e28147bf759765c4949d3a08b6ea13275d9d64e00612ecd4fc8f0ee7ac862de9ece849c88b41fb90db0f42cfb78be21edacbcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lcurse"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-beautifulsoup4 \
python3-lxml \
python3-qt5"

inherit rpm
