SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-source-vanilla-7.2.5-1.1.noarch.rpm"
RPM_HASH = "11172059b1a6b2c2abf8813c65742536d8545b8f839074243da54c1928bd09eb1edc2d66c4a6db113a28c07caa09f0206c44e10ce67af1d17d67469f58a5aa87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
