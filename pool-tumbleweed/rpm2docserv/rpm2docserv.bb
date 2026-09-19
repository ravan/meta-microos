SUMMARY = "Make manpages from RPMs accessible in a web browser"
DESCRIPTION = "rpm2docserv extracts manual pages from RPM packages and makes them accessible in a web browser."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "rpm2docserv-20260707.78c4c29-1.2.aarch64.rpm"
RPM_HASH = "582a2ac7576802b871d5d15830fb9d393aca324ad6cb971f674160c1fea3286c69570e3e8174ee14cb08be716c8a75a0dd0809aab5c16776b7698667eafb4845"

RPROVIDES:${PN} += "rpm2docserv"

RDEPENDS:${PN} += "/usr/bin/mandoc \
cpio \
libc.so.6"

inherit rpm
