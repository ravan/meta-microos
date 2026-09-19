SUMMARY = "Template engine and code generation tool"
DESCRIPTION = "Cheetah is an open source template engine and code generation tool. \
 \
It can be used standalone or combined with other tools and frameworks. \
Web development is its principle use, but Cheetah is flexible and can \
also be used to generate C++ game code, Java, SQL, form emails and even \
Python code. \
 \
It is a fork of the original CheetahTemplate library."
LICENSE = "MIT"

PV = "3.4.0.post5"

RPM_NAME = "python314-Cheetah3-3.4.0.post5-2.2.aarch64.rpm"
RPM_HASH = "a4aa85a3cb06f23315a286acc9ee18e15eea343c57ef5ff802df6e3e5a6c43dcaf9baa3087dedaeebb968d42a758aa08d1343222fa5469c2ece57a2f412ac0b2"

RPROVIDES:${PN} += "python3.14dist-ct3 \
python314-Cheetah \
python314-Cheetah3 \
python314-cheetah \
python3dist-ct3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
