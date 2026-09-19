SUMMARY = "openSUSE Tumbleweed package repositories"
DESCRIPTION = "openSUSE Tumbleweed package repository files for DNF and PackageKit."
LICENSE = "MIT"

PV = "1699"

RPM_NAME = "rpm-repos-openSUSE-Tumbleweed-1699-13.2.aarch64.rpm"
RPM_HASH = "3911e39fc6885972786803d666aedf57f6f9382893083dab3ad52534ea3c7f4c8ee52e783d82152102fda3415d5f03ddfdb35e11bcf24e4270e191dbe47ba8be"

RPROVIDES:${PN} += "config-rpm-repos-openSUSE-Tumbleweed \
rpm-repos-openSUSE \
rpm-repos-openSUSE-Tumbleweed"

RDEPENDS:${PN} += "rpm-repo-keys-openSUSE \
suse-release"

inherit rpm
