SUMMARY = "Enlightenment openSUSE profiles"
DESCRIPTION = "openSUSE variant of profiles for enlightenment."
LICENSE = "BSD-2-Clause"

PV = "20220317"

RPM_NAME = "enlightenment-profiles-openSUSE-20220317-1.13.noarch.rpm"
RPM_HASH = "e10cea8ac366c6fa9f89b0bbf6528a77822005a714f5efa0abe558b31a4a69051b042145ae53820d824e73a7c699d5746dcaac0b56989f6d15f5d706edc64480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-profiles-openSUSE"

RDEPENDS:${PN} += "enlightenment-theme-dft"

inherit rpm
