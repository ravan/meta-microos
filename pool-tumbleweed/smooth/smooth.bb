SUMMARY = "C++ class library for widgets, IO, XML and more"
DESCRIPTION = "smooth is an object oriented C++ class library. It provides basic \
functionality and platform support for applications and libraries. \
 \
Features provided by smooth include: \
 \
  * user interface API with various widgets \
  * multithreading API \
  * file and network IO interface \
  * transparent Unicode and software internationalization support \
  * a libxml2-based XML parser"
LICENSE = "Artistic-2.0"

PV = "0.9.10"

RPM_NAME = "smooth-0.9.10-1.16.aarch64.rpm"
RPM_HASH = "0e33e488a1c161ef07ce745e59fe8148c4fb0b03b8b52c822a052b296e3b9a4c6d4e5dca98bfd7878b6fb0dc5ba186bf3a4af8116f9c3f93d12934aaa6def0d1"

RPROVIDES:${PN} += "smooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsmooth-0.9.so.0 \
libstdc++.so.6"

inherit rpm
