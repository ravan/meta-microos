SUMMARY = "Frontend for compressing and uncompressing"
DESCRIPTION = "Z is a frontend for the compress/uncompress, gzip, bzip2, tar, and zip/unzip \
utilities to compress and uncompress files and directories."
LICENSE = "GPL-2.0-only"

PV = "2.7.6"

RPM_NAME = "z-2.7.6-1.1.noarch.rpm"
RPM_HASH = "12063db443cee460d6eae66ae4ca04e48fbb0556ca784a477b76d0ae90e76e03a795d357aef607e94470fd231fbe3405bffbad2471e84b7bdaefd70ac7c31023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "z"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
