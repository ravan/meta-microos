SUMMARY = "Framework for scalable cross-language services development"
DESCRIPTION = "Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "thrift-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "bca54364783639bd03a908c117cb3dbc5f8a2822957406fb1b633b21fde38258da758634628d56b14a5e93482db8dec4d8a536952c44fe5b81faec3b4b005f1f"

RPROVIDES:${PN} += "thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
