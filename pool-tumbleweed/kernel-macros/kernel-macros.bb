SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Packages \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-macros-7.2.5-1.1.noarch.rpm"
RPM_HASH = "c260a5cc4615476ccc4fa0b0d548e87102ca7a5e850eabab4a7accf2d9f73f7a7a326d6f95ea6b2e4febc8f08444c4198355a46bd46894f68864a069040333d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-macros \
kernel-subpackage-macros \
rpm-macro--kernel-module-package \
rpm-macro-cpu-arch \
rpm-macro-kernel-build-shell-package \
rpm-macro-kernel-module-directory \
rpm-macro-kernel-module-package \
rpm-macro-kernel-module-package-buildreqs \
rpm-macro-kernel-module-package-release \
rpm-macro-linux-arch \
rpm-macro-linux-make-arch \
rpm-macro-suse-kernel-module-package \
rpm-macro-usrmerged"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
