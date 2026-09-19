SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of \
glass, including risk analysis, security compliance, RBAC visualizer and image \
vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM \
charts, detecting misconfigurations according to multiple frameworks (such as \
the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC \
(role-based-access-control) violations at early stages of the CI/CD pipeline, \
calculates risk score instantly and shows risk trends over time. It became one \
of the fastest-growing Kubernetes tools among developers due to its easy-to-use \
CLI interface, flexible output formats, and automated scanning capabilities, \
saving Kubernetes users and admins’ precious time, effort, and resources. \
Kubescape integrates natively with other DevOps tools, including Jenkins, \
CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s \
deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "4.0.12"

RPM_NAME = "kubescape-4.0.12-1.1.aarch64.rpm"
RPM_HASH = "761ddc06a67306923fbaa1ed10c2dcdbcd414e07a67e39bee81751040a9117e057133892cf91ace4e9a2eb1f1c06fc027f263a424e9d88e62e8c701e0ca696d0"

RPROVIDES:${PN} += "kubescape"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
