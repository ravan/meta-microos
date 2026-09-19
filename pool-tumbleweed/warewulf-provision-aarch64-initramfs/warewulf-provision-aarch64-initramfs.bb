SUMMARY = "Warewulf Cluster Provisioning Module initramfs for aarch64 systems"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture.  The \
provision module provides functionality for provisioning, configuring, \
and booting systems. \
 \
This package contains the aarch64-specific initramfs used to build the \
bootstrap for aarch64 systems."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-provision-aarch64-initramfs-3.8.1-14.9.noarch.rpm"
RPM_HASH = "e45c08e83e65e8a8aa95a279b157444064ee9af7ec39b922abf0430d30b219f1370e924c65b5896f956ee93582de7e9ad089deed261bb9660df8e4924f6d8b66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-provision-aarch64-initramfs"

RDEPENDS:${PN} += "warewulf-provision"

inherit rpm
