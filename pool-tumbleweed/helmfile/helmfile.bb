SUMMARY = "Deploy Kubernetes Helm Charts"
DESCRIPTION = "Helmfile is a declarative spec for deploying helm charts. It lets you... \
 \
 * Keep a directory of chart value files and maintain changes in version control. \
 * Apply CI/CD to configuration changes. \
 * Periodically sync to avoid skew in environments. \
 \
To avoid upgrades for each iteration of helm, the helmfile executable \
delegates to helm - as a result, helm must be installed."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "helmfile-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "b73a7c0f034e29d9872d9c6754081539c91d3ded50f2ef8629f1219b1dc82218c5a368b673514e17d8ff2bc0d8345836c834d99113f088bdea177dd0df62aff6"

RPROVIDES:${PN} += "helmfile"

RDEPENDS:${PN} += "helm"

inherit rpm
