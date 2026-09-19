SUMMARY = "Static analysis tool that checks Kubernetes YAML files and Helm charts"
DESCRIPTION = "KubeLinter analyzes Kubernetes YAML files and Helm charts, and checks them \
against a variety of best practices, with a focus on production readiness and \
security. \
 \
KubeLinter runs sensible default checks, designed to give you useful \
information about your Kubernetes YAML files and Helm charts. This is to help \
teams check early and often for security misconfigurations and DevOps best \
practices. Some common examples of these include running containers as a \
non-root user, enforcing least privilege, and storing sensitive information \
only in secrets. \
 \
KubeLinter is configurable, so you can enable and disable checks, as well as \
create your own custom checks, depending on the policies you want to follow \
within your organization. \
 \
When a lint check fails, KubeLinter reports recommendations for how to resolve \
any potential issues and returns a non-zero exit code."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "kube-linter-0.8.3-1.5.aarch64.rpm"
RPM_HASH = "0b751ddee417dcc2931cb1902ec2699b90922a54bc18d70ea7da6d9f518612ae3aaad2abfa3f84b9d1bace51d0b95aea127c23338614e08847ba0b1b59be8978"

RPROVIDES:${PN} += "kube-linter"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
