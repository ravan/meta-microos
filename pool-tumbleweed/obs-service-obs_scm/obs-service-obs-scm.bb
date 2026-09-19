SUMMARY = "Creates a OBS cpio from a remote SCM resource"
DESCRIPTION = "Creates a OBS cpio from a remote SCM resource. \
 \
This can be used to work directly in local git checkout and can be packaged \
into a tar ball during build time."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-obs_scm-0.12.4-1.1.noarch.rpm"
RPM_HASH = "5ff78722c8f7ec489ccf5930724bd57cf438eaf143c734ec2f1e16d773cc061d403f81f90c39589947ecf3428f32565dd6ec453b76b9d3fd4a6c277f47efdb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-obs-scm \
obs-service-tar-scm-/usr/lib/obs/service/obs-scm.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
