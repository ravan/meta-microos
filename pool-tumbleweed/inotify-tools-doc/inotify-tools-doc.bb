SUMMARY = "Documentation for inotify-tools"
DESCRIPTION = "This package contains the documentation for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "4.25.9.0"

RPM_NAME = "inotify-tools-doc-4.25.9.0-1.4.noarch.rpm"
RPM_HASH = "bdc7817defe94105ebc8fa4b0b51979e0eafc59d6c83bac7cecc2ad0ffcc18c92bd55b4e9e3c46c546c03dfb5c170d80fffdfb126d1783bebc3fc61b7b5525e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inotify-tools-doc"

RDEPENDS:${PN} += "inotify-tools"

inherit rpm
