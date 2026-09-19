SUMMARY = "UEFI secure boot toolkit"
DESCRIPTION = "The collection of tools for UEFI secure boot (userspace tools only)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.9.2"

RPM_NAME = "efitools-1.9.2-4.5.aarch64.rpm"
RPM_HASH = "bcf298025cca22cc4ca6451ccd400155d20d6857d6931401f080a20e12e5646bb1b3cdb1de2b13389915687650df69804567eda0ddc466c93c7b11716ec79905"

RPROVIDES:${PN} += "efitools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3"

inherit rpm
