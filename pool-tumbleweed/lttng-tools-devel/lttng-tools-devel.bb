SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.14.0"

RPM_NAME = "lttng-tools-devel-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "47192d93986ea3ab0da15fcd564b7c61ecf96a15250a08d02a8db8bd4ad97a8b4a80b77dd09e4ac42b2b4c564c7678d1ae1ae3c59b3a6dd044d89cf549c0bb0a"

RPROVIDES:${PN} += "lttng-tools-devel \
pkgconfig-lttng-ctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblttng-ctl6 \
pkgconfig-liburcu \
pkgconfig-liburcu-cds"

inherit rpm
