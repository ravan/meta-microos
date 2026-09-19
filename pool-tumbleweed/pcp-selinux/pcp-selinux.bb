SUMMARY = "Selinux policy package"
DESCRIPTION = "This package contains SELinux support for PCP.  The package contains \
interface rules, type enforcement and file context adjustments for an \
updated policy package."
LICENSE = "GPL-2.0+ & CC-BY-SA-3.0"

PV = "6.3.8"

RPM_NAME = "pcp-selinux-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "e2415e768ae297aa58ff94af4295adadbce43035c657c737b69a93d0ff2cf5ea6571fbf9acb1489374167d8eaa6d854eb251834f291398c6486b93a6592ecaab"

RPROVIDES:${PN} += "pcp-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
pcp \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base"

inherit rpm
