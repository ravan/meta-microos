SUMMARY = "Documentation for libklu"
DESCRIPTION = "Documentation for libklu."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libklu-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "d01f47cf7f18df219f7eaec23740a5f3dfb4cde6324abad4d05a290999a74174a5077ee3723b4011f78d062608e97ed2501f9d12231da178a2f1fe9304586189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libklu-doc"

RDEPENDS:${PN} += ""

inherit rpm
