SUMMARY = "CLI for the meshery cloud native management plane"
DESCRIPTION = "Meshery manages the provisioning, configuration and operation of your \
Kubernetes clusters, workloads, and service meshes. While supporting hundreds \
of different types of cloud native infrastructure integrations. \
 \
Meshery also offers a catalog of curated design templates filled with \
configuration best practices. \
 \
Using a GitOps-centric approach, visually and collaboratively design and manage \
your infrastructure and microservices. Use Meshery to interoperate your various \
cloud native systems. With both REST and GraphQL APIs, integrating with Meshery \
as an extensible platform is facilitated through NATS, CloudEvents, gRPC, \
Service Mesh Interface (SMI), and Service Mesh Performance (SMP)."
LICENSE = "Apache-2.0"

PV = "1.0.65"

RPM_NAME = "mesheryctl-1.0.65-1.1.aarch64.rpm"
RPM_HASH = "dbb2f86092cd0b07e8a00cca1c480492a8f516a33ab5eeb7ab8574a1b9f79f9c62ee204093014d6f7b17460321f7534f07f3cefdc68c78508e60eb9bd45d178a"

RPROVIDES:${PN} += "mesheryctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
