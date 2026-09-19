SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.7.0+async"

RPM_NAME = "python314-asyncclick-8.1.7.0+async-1.11.noarch.rpm"
RPM_HASH = "b5869e89b158a3f6ae6c5e788910e2b9fdecde1123c5f2d3f72c8080fb6bda20ebba4b3401bbe088a178a31e5fdb1349317998bcc967c84ec0b7146166805636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asyncclick \
python314-asyncclick \
python3dist-asyncclick"

RDEPENDS:${PN} += "python-abi \
python314-anyio"

inherit rpm
