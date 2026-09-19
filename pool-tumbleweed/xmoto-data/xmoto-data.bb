SUMMARY = "Xmoto architecture independent data"
DESCRIPTION = "Xmoto translations and some other architecture independent data."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.3"

RPM_NAME = "xmoto-data-0.6.3-1.7.noarch.rpm"
RPM_HASH = "71d210598eb2e367d31ab55431f02cce1f4e36bf4d77fb4f98d39eec30516917c63d7200124ef97f1d632efc67469983dccfb73551435a1f4123a0f934718900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmoto-data"

RDEPENDS:${PN} += "xmoto"

inherit rpm
