SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python314-haproxyctl-0.5-5.5.noarch.rpm"
RPM_HASH = "fc48fde38996759ea8dcc1acf4a5fbeaac9e90719f7d9de3d905b38d056ab75efa625b1a020b9685bd312b026deae5cde3333afe7b9fe6e387c099273d0424de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-haproxyctl \
python314-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
haproxy \
python-abi"

inherit rpm
