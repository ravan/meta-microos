SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-parser-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "6794fb1f57b5cd70d352d1f2a245f7440587400b0083519994d5178a614aef94c02d76f8d2062c243463b6b84d86e414646a777bca781cb3aa5ca24fbc9b3d8f"

RPROVIDES:${PN} += "apparmor-parser \
apparmor-parser-CAP-SYSLOG \
config-apparmor-parser \
libimnxcert \
subdomain-leaf-cert \
subdomain-parser \
subdomain-parser-common \
subdomain-parser-demo"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
