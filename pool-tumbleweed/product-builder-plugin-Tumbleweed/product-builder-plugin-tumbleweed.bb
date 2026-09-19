SUMMARY = "openSUSE - KIWI Image System"
DESCRIPTION = "openSUSE - Product Builder Image System InstSource plugins provides information \
and plugin code to create meta information for a SUSE \
installation source. This particular package contains the metadata \
plugins specific for the openSUSE Tumblweed media."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.3"

RPM_NAME = "product-builder-plugin-Tumbleweed-1.8.3-1.9.noarch.rpm"
RPM_HASH = "ce8b8a4e055a43041e7bbdb2167e68afeb2fb7d78abb5e7634c6322edc6a4b93b51156bc498e83af7d882263354598122e65f8a790c8ceee206ee603567fe44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-product-builder-plugin-Tumbleweed \
perl-KIWIBasePlugin \
perl-KIWIBootIsoPlugin \
perl-KIWIChecksumPlugin \
perl-KIWIDescrPlugin \
perl-KIWIDnfRepoclosurePlugin \
perl-KIWIEulaPlugin \
perl-KIWIInstallCheckPlugin \
perl-KIWIMiniIsoPlugin \
perl-KIWIPackagesDVDPlugin \
product-builder-plugin \
product-builder-plugin-Tumbleweed"

RDEPENDS:${PN} += "build \
createrepo-c \
dnf \
instsource-susedata \
mkdosfs \
mtools \
openSUSE-appstream-process \
package-EULAs \
package-translations \
perl-YAML--XS \
product-builder"

inherit rpm
