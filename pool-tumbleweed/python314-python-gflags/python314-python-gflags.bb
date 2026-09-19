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

RPM_NAME = "python314-python-gflags-3.1.2-3.5.noarch.rpm"
RPM_HASH = "6bb13d771d0916db4cba34ef6709151392153d1964d201dc44a05b3ad7e861fa8ef08735e27768bda08575ba57fdcd9962a9fbb892a9796c69cd709349bdc65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-gflags \
python314-python-gflags \
python3dist-python-gflags"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
python-abi"

inherit rpm
