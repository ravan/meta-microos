SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-utils-5.0.2-2.1.noarch.rpm"
RPM_HASH = "aa14c2f705516f2ee185f424b25a3018c90ffbf73839920fcc23f365f389796a230d4bbe76a54d0d1948b110a5ad3c6769c9bd30c00809862011e955fc1b0f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils \
config-apparmor-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
apparmor-parser \
libapparmor1 \
python3-apparmor \
python3-base \
python3-notify2 \
python3-psutil"

inherit rpm
