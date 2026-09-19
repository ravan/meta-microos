SUMMARY = "Stacked GIT - Source Code Management Tool"
DESCRIPTION = "Stacked Git, StGit for short, is an application for managing Git commits \
as a stack of patches. \
With a patch stack workflow, multiple patches can be developed \
concurrently and efficiently, with each patch focused on a single \
concern, resulting in both a clean Git commit history and improved \
productivity."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "f3ecaaf42141aeb098b5cc095e8638aea813c1992c7b828601135afc6210fb5b3be22a76ef2fb2eacc5fdf6c0af2499623c76a3acbb647bfb0d4fc63e0b59352"

RPROVIDES:${PN} += "stgit"

RDEPENDS:${PN} += "git-core \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
