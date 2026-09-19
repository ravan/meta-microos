SUMMARY = "Fence agent for Raritan Dominion PX"
DESCRIPTION = "Fence agent for Raritan Dominion PX."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-raritan-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "6abefe971fcdce4d52d715844e17307a74d9839e0e1b18828a753df97c9dde2c644399b50d997ac4cdd1fd4e79c760a7896f5c068a7e08850c2291907e7714cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-raritan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
