SUMMARY = "Development files for inotify-tools"
DESCRIPTION = "This package contains the development files for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "4.25.9.0"

RPM_NAME = "inotify-tools-devel-4.25.9.0-1.4.aarch64.rpm"
RPM_HASH = "a23c22c9e9d0f61c76f4f4c2034514f8fecf8b17aa88b6f67489c050432b7bdaf92428f2d8bbfb330b8183742514d8c9d0bb692b6bf98ef90c7ac27725af51c4"

RPROVIDES:${PN} += "inotify-tools-devel"

RDEPENDS:${PN} += "libinotifytools0"

inherit rpm
