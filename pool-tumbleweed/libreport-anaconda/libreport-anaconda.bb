SUMMARY = "Default configuration for reporting anaconda bugs"
DESCRIPTION = "Default configuration for reporting Anaconda problems or uploading the gathered \
data over ftp/scp..."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-anaconda-2.17.15-1.13.noarch.rpm"
RPM_HASH = "40366352f9642c2ef5b0c0e40c75fcbd63a19a49e27e3a2a66c428ea39418e80e243817cfc6dea2853fe303d2972e2f577905d92cf770344d4207e5441e7b1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libreport-anaconda \
libreport-anaconda"

RDEPENDS:${PN} += "libreport-2 \
libreport-plugin-bugzilla \
libreport-plugin-reportuploader"

inherit rpm
