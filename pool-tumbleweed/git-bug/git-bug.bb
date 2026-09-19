SUMMARY = "Distributed, offline-first bug tracker embedded in git, with bridges"
DESCRIPTION = "git-bug is a bug tracker that: \
 \
* is fully embedded in git: you only need your git repository to have \
  a bug tracker \
* is distributed: use your normal git remote to collaborate, push and \
  pull your bugs! \
* works offline: in a plane or under the sea? Keep reading and \
  writing bugs! \
* prevents vendor lock-in: your usual service is down or went bad? \
  You already have a full backup. \
* is fast: listing bugs or opening them is a matter of \
  milliseconds \
* doesn't pollute your project: no files are added in your \
  project \
* integrates with your tooling: use the UI you like (CLI, \
  terminal, web) or integrate with your existing tools through \
  the CLI or the GraphQL API \
* bridges to other bug trackers: use bridges to import and export \
  to other trackers."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "git-bug-0.10.1-7.1.aarch64.rpm"
RPM_HASH = "b0020588e1b7a052549188d2262785d5e490ba68d8735e0bd2e6e7325e8c277fd32a29271a50dee97065d89be3af7a808880ef66900b1f97dfe17275b14705c7"

RPROVIDES:${PN} += "git-bug"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
