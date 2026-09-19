SUMMARY = "A Simple and Comprehensive Vulnerability Scanner for Containers"
DESCRIPTION = "Trivy (`tri` pronounced like trigger, `vy` pronounced like envy) is a simple and \
comprehensive vulnerability scanner for containers and other artifacts. A \
software vulnerability is a glitch, flaw, or weakness present in the software or \
in an Operating System. Trivy detects vulnerabilities of OS packages (Alpine, \
RHEL, CentOS, etc.) and application dependencies (Bundler, Composer, npm, yarn, \
etc.). Trivy is easy to use. Just install the binary and you're ready to \
scan. All you need to do for scanning is to specify a target such as an image \
name of the container."
LICENSE = "Apache-2.0"

PV = "0.74.0"

RPM_NAME = "trivy-0.74.0-4.1.aarch64.rpm"
RPM_HASH = "21ee092fd8b8897e97ab403a045f14709d5956a69b0d17bf90dee79d886f894bb27db388be697bd8af9d36f638ac46a61c3892d89f5f3a1216a1a0b790097db3"

RPROVIDES:${PN} += "trivy"

RDEPENDS:${PN} += "ca-certificates \
git-core \
libc.so.6"

inherit rpm
