SUMMARY = "SELinux Translation Daemon"
DESCRIPTION = "Security-enhanced Linux is a feature of the Linux kernel and a number \
of utilities with enhanced security functionality designed to add \
mandatory access controls to Linux.  The Security-enhanced Linux \
kernel contains new architectural components originally developed to \
improve the security of the Flask operating system. These \
architectural components provide general support for the enforcement \
of many kinds of mandatory access control policies, including those \
based on the concepts of Type Enforcement, Role-based Access \
Control, and Multi-level Security. \
 \
mcstrans provides a translation daemon to translate SELinux categories \
from internal representations to user defined representation."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "mcstrans-3.11-1.2.aarch64.rpm"
RPM_HASH = "adf86ec76cef318c61ec6e8a1ec03efc09bc245523a3bd5f02b5bb8e10e105b20cb78fa2e465288c79eb5d18fc00689ec79971389421a8b24827830ae3de08a0"

RPROVIDES:${PN} += "mcstrans \
setransd"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libpcre2-8.so.0 \
libselinux.so.1 \
systemd"

inherit rpm
