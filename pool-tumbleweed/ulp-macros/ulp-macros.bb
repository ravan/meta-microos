SUMMARY = "Macros for enabling Userspace Live Patching into processes"
DESCRIPTION = "This package contain macros for enabling Userspace Live Patching into packages"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "ulp-macros-1.0-8.1.noarch.rpm"
RPM_HASH = "7b28769efa53d969cfe9cd88c227b0f0e07e0b9b8f13a67790d48b7ef53ed4504e8cfd5e81b5cf9cd833f5c2c492602f4ff9a237d35eef4414e25fd2aa7769ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-cflags-livepatching \
rpm-macro-clones-dest-dir \
rpm-macro-pack-ipa-dumps \
rpm-macro-requires-ge-with-release \
rpm-macro-tar-lp-basename \
rpm-macro-tar-lp-package-name \
ulp-macros"

RDEPENDS:${PN} += ""

inherit rpm
