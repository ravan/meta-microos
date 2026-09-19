SUMMARY = "Migration and Upgrade tool for openSUSE"
DESCRIPTION = "openSUSE migration and upgrade tool which utilizes get.opensuse.org product API and openSUSE-repos \
for a cross-distro migration and upgrade to a new versions of point releases."
LICENSE = "Apache-2.0"

PV = "20260517.df4e731"

RPM_NAME = "opensuse-migration-tool-20260517.df4e731-1.2.noarch.rpm"
RPM_HASH = "7531998ced85accc5a513c7db0a464f639a757654758522f9d7212075a0925c15b43c0975e3107d68d7b9ad7597aca1ca8db7de68324145295f0975e0d7982c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensuse-migration-tool"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
curl \
dialog \
gawk \
jq \
sed"

inherit rpm
