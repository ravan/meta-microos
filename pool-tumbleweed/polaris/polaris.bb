SUMMARY = "Validation of best practices in your Kubernetes clusters"
DESCRIPTION = "Best Practices for Kubernetes Workload Configuration \
 \
Fairwinds' Polaris keeps your clusters sailing smoothly. It runs a variety of \
checks to ensure that Kubernetes pods and controllers are configured using best \
practices, helping you avoid problems in the future. \
 \
Polaris can be run in three different modes: \
* As a dashboard, so you can audit what's running inside your cluster. \
* As an admission controller, so you can automatically reject workloads that \
  don't adhere to your organization's policies. \
* As a command-line tool, so you can test local YAML files, e.g. as part of a \
  CI/CD process."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "polaris-10.2.2-1.1.aarch64.rpm"
RPM_HASH = "3d8ba44d5643c8b8d9f032bcf657b159ca1408960fd98e74d11e52eb6ac639bd757a38be612c474572ebf6752044062671878c9340b97b8dbc775ad3f6aa3770"

RPROVIDES:${PN} += "polaris"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
