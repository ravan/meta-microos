SUMMARY = "C++ stdlib man pages"
DESCRIPTION = "stdman is a tool that parses archived HTML files from cppreference and \
generates groff-formatted manual pages for Unix-based systems. The goal is to \
provide excellent formatting for easy readability. \
 \
This package provides the full cppreference documentation in the man format."
LICENSE = "MIT"

PV = "2024.07.05"

RPM_NAME = "stdman-2024.07.05-1.7.noarch.rpm"
RPM_HASH = "ed27f5427551661aeaa5b8b3fe6666edf3b8ef7f8812bde6a6634e550d38c5f9692f3435a4ec1cde8a35c00479c3156623272e6407b770d6ca5a42fd083ab659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stdman"

RDEPENDS:${PN} += "man"

inherit rpm
