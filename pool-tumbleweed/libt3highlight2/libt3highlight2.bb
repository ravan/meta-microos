SUMMARY = "The Tilde Toolkit's syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight2-0.5.0-1.26.aarch64.rpm"
RPM_HASH = "999915f49f23a66833aac9f28bf9b567e247e5ade991ba51fda7139a18efdde31e8899177cf54b198cc6cb9ce037056c6783e19495e2f86f1d3e9f40c1e4e958"

RPROVIDES:${PN} += "libt3highlight.so.2 \
libt3highlight2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libt3config.so.0"

inherit rpm
