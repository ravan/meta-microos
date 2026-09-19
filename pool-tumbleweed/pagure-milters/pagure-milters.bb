SUMMARY = "Milter to integrate pagure with emails"
DESCRIPTION = "Milters (Mail filters) allowing the integration of pagure and emails. \
This is useful for example to allow commenting on a ticket by email."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-milters-5.14.1-3.3.noarch.rpm"
RPM_HASH = "004a29bf436b8366a8789853eea8c0cad717d28c84234ba684cee0fddb0f025b9de0da7b321d6557bb64628846f57b0bd363eee55397a6c3a36a2ebcca42cee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-milters"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
postfix \
python3-pymilter \
systemd"

inherit rpm
