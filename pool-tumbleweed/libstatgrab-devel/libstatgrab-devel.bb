SUMMARY = "Development Environment for libstatgrab"
DESCRIPTION = "Development environment for libstatgrab (headers, library links, static library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.92.1"

RPM_NAME = "libstatgrab-devel-0.92.1-2.1.aarch64.rpm"
RPM_HASH = "59c150a123c9fe9574f106230069dfdf70b74a07ea11d72afb1e14dddae6cb2b120eff474cf92a7cb1f059b440c4423f4387246b10072f783c33442913f6d361"

RPROVIDES:${PN} += "libstatgrab-devel \
pkgconfig-libstatgrab"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstatgrab10"

inherit rpm
