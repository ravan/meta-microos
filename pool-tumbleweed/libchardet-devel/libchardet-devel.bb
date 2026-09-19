SUMMARY = "Development files of libchardet"
DESCRIPTION = "The libchardet development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libchardet."
LICENSE = "MPL-1.1"

PV = "1.0.6"

RPM_NAME = "libchardet-devel-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "2f60750fcd849cb9bc7ebf741ac137dcc516816e1e925db689dc34269867da3987347c4c9b78579b7fe96cabe49aa3eb66e140cfea3f0decdabe7e715fec8913"

RPROVIDES:${PN} += "libchardet-devel \
pkgconfig-chardet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchardet1"

inherit rpm
