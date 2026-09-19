SUMMARY = "Tool to show who has permissions to verbs and resources in Kubernetes"
DESCRIPTION = "kubectl-who-can shows who has permissions \
to <verb> <resources> in kubernetes"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "kubectl-who-can-0.4.0-1.10.aarch64.rpm"
RPM_HASH = "51c146ad8145361a707e27ab6a934968223f4829c6744ee84d908695dca79d6f897c51dd72209867cbbbe2fc658b3ec36c3acacf15f0460f04a278dfc70c7495"

RPROVIDES:${PN} += "kubectl-who-can"

RDEPENDS:${PN} += ""

inherit rpm
