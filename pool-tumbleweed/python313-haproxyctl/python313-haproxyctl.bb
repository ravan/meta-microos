SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python313-haproxyctl-0.5-5.5.noarch.rpm"
RPM_HASH = "afda5d0d299c1416f5190cce246a02f1f673713cd34b5cb8bc2b334e374c316f7c4e5af7f30a104ec15dd0455dc5b44542625500bbc426104ffbd149ef337938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-haproxyctl \
python3.13dist-haproxyctl \
python313-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
haproxy \
python-abi"

inherit rpm
