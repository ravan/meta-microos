SUMMARY = "Declaratively manage your cloud infrastructure"
DESCRIPTION = "Fork of Terraform \
 \
OpenTofu is an OSS tool for building, changing, and versioning infrastructure \
safely and efficiently. OpenTofu can manage existing and popular service \
providers as well as custom in-house solutions. \
 \
The key features of OpenTofu are: \
- Infrastructure as Code: Infrastructure is described using a high-level \
  configuration syntax. This allows a blueprint of your datacenter to be \
  versioned and treated as you would any other code. Additionally, infrastructure \
  can be shared and re-used. \
- Execution Plans: OpenTofu has a 'planning' step where it generates an \
  execution plan. The execution plan shows what OpenTofu will do when you call \
  apply. This lets you avoid any surprises when OpenTofu manipulates \
  infrastructure. \
- Resource Graph: OpenTofu builds a graph of all your resources, and \
  parallelizes the creation and modification of any non-dependent resources. \
  Because of this, OpenTofu builds infrastructure as efficiently as possible, and \
  operators get insight into dependencies in their infrastructure. \
- Change Automation: Complex changesets can be applied to your infrastructure \
  with minimal human interaction. With the previously mentioned execution plan \
  and resource graph, you know exactly what OpenTofu will change and in what \
  order, avoiding many possible human errors."
LICENSE = "MPL-2.0"

PV = "1.12.6"

RPM_NAME = "opentofu-1.12.6-1.1.aarch64.rpm"
RPM_HASH = "5ea6474f2fad28f11542f560d645c10a189c51e450689f6ef5f4a8b72549f3eb90fb5c31404f940db2e2cccff158d655141a8926b991093eea6848e06cda0dfa"

RPROVIDES:${PN} += "opentofu"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
