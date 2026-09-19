SUMMARY = "Plugin script for snapper"
DESCRIPTION = "Plugin scripts for snapper to handle BLS config files"
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-snapper-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "69a9087a4061b8264f28799f5be33785340002320cd85832ed7789aac169bf372efa735cb9964e4f11a104608474b26671006470b35a8c52d455307838ff1bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
btrfsprogs \
sdbootutil \
snapper"

inherit rpm
