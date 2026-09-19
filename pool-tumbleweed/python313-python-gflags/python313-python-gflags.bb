SUMMARY = "Google Commandline Flags Module"
DESCRIPTION = "This project is the python equivalent of google-gflags, a Google commandline \
flag implementation for C++. It is intended to be used in situations where a \
project wants to mimic the command-line flag handling of a C++ app that uses \
google-gflags, or for a Python app that, via swig or some other means, is \
linked with a C++ app that uses google-gflags. \
 \
The gflags package contains a library that implements commandline flags \
processing. As such it's a replacement for getopt(). It has increased \
flexibility, including built-in support for Python types, and the ability to \
define flags in the source file in which they're used. (This last is its major \
difference from OptParse.)"
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python313-python-gflags-3.1.2-3.5.noarch.rpm"
RPM_HASH = "ccb9e2407cfe67ec4391de8aca40bc76cc64716fa236c0102329c83a6a332ecaddb9073683e06194822abb4305c3af9f0bb21cffb53eaaf7180cbf1570b4f6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gflags \
python3.13dist-python-gflags \
python313-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
python-abi"

inherit rpm
