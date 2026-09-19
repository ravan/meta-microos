SUMMARY = "CLI for the digger open source IaC orchestration tool"
DESCRIPTION = "CI/CD for Terraform is tricky. To make life easier, specialised CI systems aka \
TACOS exist - Terraform Cloud, Spacelift, Atlantis, etc. \
 \
But why have 2 CI systems? Why not reuse the async jobs infrastructure with \
compute, orchestration, logs, etc of your existing CI? \
 \
Digger runs terraform natively in your CI. This is: \
 \
* Secure, because cloud access secrets aren't shared with a third-party \
* Cost-effective, because you are not paying for additional compute just to run \
  your terraform \
 \
Features \
 \
* Terraform plan and apply in pull request comments \
* Private runners - thanks to the fact that there are no separate runners! Your \
  existing CI's compute environment is used \
* Open Policy Agent (OPA) support for RBAC \
* PR-level locks (on top of Terraform native state locks, similar to Atlantis) \
  to avoid race conditions across multiple PRs \
* Terragrunt, Workspaces, multiple Terraform versions, static analysis via \
  Checkov, plan persistence, ... \
* Drift detection \
 \
This package contains the digger CLI."
LICENSE = "Apache-2.0"

PV = "0.6.149"

RPM_NAME = "digger-cli-0.6.149-1.1.aarch64.rpm"
RPM_HASH = "f4c086da11e3f1185c70b05eea7cf227e069f0178495d570841210c189a5dec8e803712deee9d00fef68b7f2429fdc2347fceba25bf109da9e50ced138c61432"

RPROVIDES:${PN} += "digger-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
