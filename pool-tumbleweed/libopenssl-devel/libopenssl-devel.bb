SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libopenssl-devel-3.5.3-1.3.noarch.rpm"
RPM_HASH = "5112fde8c5441446435839787fd7bd0efe46fcc768d8f024e9521d170dc168ec69f2e338bdc76f0b322ce81e481dfa5594f93ef0b7ebb06a5dd6290790bc81cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenssl-devel \
openssl-devel \
pkgconfig-libcrypto \
pkgconfig-libopenssl \
pkgconfig-libssl \
pkgconfig-openssl"

RDEPENDS:${PN} += "libopenssl-3-devel \
libopenssl3 \
openssl \
pkgconfig"

inherit rpm
