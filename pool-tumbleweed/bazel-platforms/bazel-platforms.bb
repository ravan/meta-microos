SUMMARY = "Bazel constraint values for specifying platforms and toolchains"
DESCRIPTION = "Bazel platforms contains all canonical constraint_settings, constraint_values \
and platforms that are universally useful across languages and Bazel projects."
LICENSE = "Apache-2.0"

PV = "20190611"

RPM_NAME = "bazel-platforms-20190611-1.18.noarch.rpm"
RPM_HASH = "31d7133a99a80b42d357b8e162d4ef8f2a3f1b89d9531c53db61e00330227543b2c981b328d8d7c1bcde711eeef2ffbe51e256572a06d5263ea6bcf72d944266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-platforms"

RDEPENDS:${PN} += ""

inherit rpm
