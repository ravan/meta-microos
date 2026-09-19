SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-fa-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "376e79f0b711975c2a7da5fb558a59b60a64e4cb2fa5fe618d7bb843dc3fd8d11caf4de9993d19e05e7c32dba2a445f3c3c4a59a1e5f1b2fa51ff5381f52701d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
