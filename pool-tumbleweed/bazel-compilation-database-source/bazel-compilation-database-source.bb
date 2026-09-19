SUMMARY = "Source code of bazel-compilation-database"
DESCRIPTION = "A JSON Compilation Database generator following the Clang specification \
for Bazel. \
 \
This package contains source code of bazel-compilation-database."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "bazel-compilation-database-source-0.4.1-1.18.noarch.rpm"
RPM_HASH = "6ffedae09a44daa5408f023de9114949270ad0b77886634ad48d4bbe68be48ef3a8ffb0c87ebcfe5edfb3a2e35963e3d014e74692ad5fd46f8b2048dc0cde315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-compilation-database-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
