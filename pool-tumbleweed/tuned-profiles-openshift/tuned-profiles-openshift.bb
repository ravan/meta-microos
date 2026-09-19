SUMMARY = "Additional tuned profile(s) optimized for the OpenShift platform"
DESCRIPTION = "Additional 3 profiles for the Openshift platform: \
A parent profile containing tuning shared by OpenShift control plane and worker nodes. \
One profile optimized for OpenShift control plane. \
And a third profile optimized for general workloads on OpenShift worker nodes."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-openshift-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "96d714f3259f135361ff37e161dae6e393aad1cf7fa3023321163c662fbdf760ebcbfadec1677f3b61838629080dd041c96640c8819aaa24a46bcd225bf05d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-openshift"

RDEPENDS:${PN} += "tuned"

inherit rpm
