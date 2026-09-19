SUMMARY = "Include-files and documentation for ccrtp"
DESCRIPTION = "This package contains files needed when developing applications using \
ccrtp."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-devel-2.1.2-2.37.aarch64.rpm"
RPM_HASH = "62940ee7498b09102c75aaf414f96f0256617d12074dc784f1ce4de30ba5e329fe0a432e252ad04bdb52df91b33d159f398b566ece8d02c1b45895c8384aba76"

RPROVIDES:${PN} += "ccrtp-devel \
libccrtp-devel \
libccrtp3-devel \
pkgconfig-libccrtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libccrtp3 \
libgcrypt-devel \
pkgconfig-commoncpp \
ucommon-devel"

inherit rpm
