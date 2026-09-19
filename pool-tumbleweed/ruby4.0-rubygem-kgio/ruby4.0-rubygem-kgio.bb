SUMMARY = "kinder, gentler I/O for Ruby"
DESCRIPTION = "This is a legacy project, do not use it for new projects.  Ruby \
2.3 and later should make this obsolete.  kgio provides \
non-blocking I/O methods for Ruby without raising exceptions on \
EAGAIN and EINPROGRESS."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.4"

RPM_NAME = "ruby4.0-rubygem-kgio-2.11.4-1.28.aarch64.rpm"
RPM_HASH = "4b43949ff8af8f10b0b5a78fc8eb85e2b7a6753a517fdcc9ce687976b6e4d083759117a3b5f727f54d67be7461ef811d57ce274809bf57c8637473ac3b11cecf"

RPROVIDES:${PN} += "ruby4.0-rubygem-kgio \
rubygem-kgio \
rubygem-ruby-4.0.0-kgio \
rubygem-ruby-4.0.0-kgio-2 \
rubygem-ruby-4.0.0-kgio-2.11 \
rubygem-ruby-4.0.0-kgio-2.11.4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
