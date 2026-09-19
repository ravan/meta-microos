SUMMARY = "Common parts of SCM handling services"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git and hg repositories. \
 \
This package holds the shared files for different services."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-obs_scm-common-0.12.4-1.1.noarch.rpm"
RPM_HASH = "a65d198b82e99a1e7e831aadb6e383d0487359f06449be6d3b40772eb34a5a70060298f28a3786ff64fd03bc9768f296c76a4bec04adf3cead179353ee077d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-obs-scm-common \
obs-service-obs-scm-common"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
glibc-locale-base \
python313-PyYAML \
python313-dateutil"

inherit rpm
