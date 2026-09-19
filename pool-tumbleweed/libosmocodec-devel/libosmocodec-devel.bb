SUMMARY = "Development files for the Osmocom GSM codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocodec."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocodec-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "6ae79a3542054c533c5b8217bc13fdcda998542236087d727d4b5eaf605f2eaf1cf62f45196e59e1f4943a789fdef9806725670442856b3e291799a347f7c014"

RPROVIDES:${PN} += "libosmocodec-devel \
pkgconfig-libosmocodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocodec4 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
