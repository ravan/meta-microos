SUMMARY = "SELinux policy configuration"
DESCRIPTION = "A complete SELinux policy that can be used as the system policy for a variety \
of systems and used as the basis for creating other policies."
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-20260910-1.1.noarch.rpm"
RPM_HASH = "30ad2515b8cbf35c0512f32dfcd1f6c116e8bc5d462c246e6d7d921162bc27fb8daaecf4718cedf67548b53b0e522249b80a07e9b47265d6b5bbf891790385c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy \
rpm-macro--file-context-file \
rpm-macro--file-context-file-pre \
rpm-macro--file-custom-defined-booleans \
rpm-macro--file-custom-defined-booleans-tmp \
rpm-macro--selinux-policy-version \
rpm-macro--selinux-store-path \
rpm-macro--selinux-store-policy-path \
rpm-macro-selinux-modules-install \
rpm-macro-selinux-modules-uninstall \
rpm-macro-selinux-relabel-post \
rpm-macro-selinux-relabel-pre \
rpm-macro-selinux-requires \
rpm-macro-selinux-requires-min \
rpm-macro-selinux-set-booleans \
rpm-macro-selinux-unset-booleans \
selinux-policy \
selinux-policy-storeroot-etc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/bin/sha512sum \
pam-config \
policycoreutils \
selinux-tools"

inherit rpm
