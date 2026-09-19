SUMMARY = "CLI for kpt - automate Kubernetes Configuration Editing"
DESCRIPTION = "kpt is a package-centric toolchain that enables a WYSIWYG configuration \
authoring, automation, and delivery experience, which simplifies managing \
Kubernetes platforms and KRM-driven infrastructure (e.g., Config Connector, \
Crossplane) at scale by manipulating declarative Configuration as Data. \
 \
Configuration as Data is an approach to management of configuration which: \
 \
- makes configuration data the source of truth, stored separately from the live \
  state \
- uses a uniform, serializable data model to represent configuration \
- separates code that acts on the configuration from the data and from packages \
  / bundles of the data \
- abstracts configuration file structure and storage from operations that act \
  upon the configuration data; clients manipulating configuration data don’t \
  need to directly interact with storage (git, container images). \
 \
See the FAQ for more details about how kpt is different from alternatives."
LICENSE = "Apache-2.0"

PV = "1.0.0~beta.67"

RPM_NAME = "kpt-cli-1.0.0~beta.67-1.2.aarch64.rpm"
RPM_HASH = "451757bf449c32ff103171423644f693898004e47a75e166067d3e2e80d46a5f69a0b817cd33ef7c38fd5c21836fb8bf0e67436d3a3910e72861ab408488d699"

RPROVIDES:${PN} += "kpt-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
