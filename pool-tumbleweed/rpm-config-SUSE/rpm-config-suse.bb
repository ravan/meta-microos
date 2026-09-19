SUMMARY = "SUSE specific RPM configuration files"
DESCRIPTION = "This package contains the RPM configuration data for the SUSE and \
openSUSE distribution families."
LICENSE = "GPL-2.0-or-later"

PV = "20250904"

RPM_NAME = "rpm-config-SUSE-20250904-1.4.noarch.rpm"
RPM_HASH = "c2192595d699d1330107f761b7e04b014c17ceb4b25e1d3307aa43d8e71c6628a9f92537c070fe2537eb8b84aa87808848d606efd4e8fdc06dea59a689e7852c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-config-SUSE \
rpm-macro--binarychangelogtrim \
rpm-macro--vpath-builddir \
rpm-macro--vpath-srcdir \
rpm-macro-ext-info \
rpm-macro-ext-man \
rpm-macro-is-opensuse \
rpm-macro-ldconfig \
rpm-macro-ldconfig-post \
rpm-macro-ldconfig-postun \
rpm-macro-ldconfig-scriptlets \
rpm-macro-leap-version \
rpm-macro-regenerate-initrd-post \
rpm-macro-regenerate-initrd-posttrans \
rpm-macro-regenerate-initrd-requires \
rpm-macro-sbat-distro \
rpm-macro-sbat-distro-opensuse \
rpm-macro-sbat-distro-sle \
rpm-macro-sbat-distro-summary \
rpm-macro-sbat-distro-summary-opensuse \
rpm-macro-sbat-distro-summary-sle \
rpm-macro-sbat-distro-url \
rpm-macro-sles-version \
rpm-macro-suse-version \
rpm-macro-ul-version \
rpm-macro-user-group-add"

RDEPENDS:${PN} += "/usr/bin/sh \
rpm"

inherit rpm
