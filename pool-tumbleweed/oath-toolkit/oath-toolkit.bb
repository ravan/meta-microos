SUMMARY = "Toolkit for one-time password authentication systems"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. It contains shared libraries, command line \
tools and a PAM module. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238). OATH stands for Open AuTHentication, which is the \
organization that specify the algorithms. For managing secret key \
files, the Portable Symmetric Key Container (PSKC) format described in \
RFC6030 is supported."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "oath-toolkit-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "1b2d14127298e724f93a2583a8d13937caeee91fa284cb106282e3023b3c8aaaaaf6c15f6e18616726727a7c05bb6d848955bb7f3ce87289de1b526d67faccaf"

RPROVIDES:${PN} += "oath-toolkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboath.so.0 \
libpskc.so.0"

inherit rpm
