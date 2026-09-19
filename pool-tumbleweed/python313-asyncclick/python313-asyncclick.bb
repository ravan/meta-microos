SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.7.0+async"

RPM_NAME = "python313-asyncclick-8.1.7.0+async-1.11.noarch.rpm"
RPM_HASH = "fb9408291f608e3c44db6ffdcac956280482654e0c3678eec8cb736d84cb9af07ba597a6d07a39e464067eb840adf5bded5939fe58e4506b451fc7f6ec85f620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncclick \
python3.13dist-asyncclick \
python313-asyncclick \
python3dist-asyncclick"

RDEPENDS:${PN} += "python-abi \
python313-anyio"

inherit rpm
