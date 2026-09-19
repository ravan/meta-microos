SUMMARY = "Internal test files for mcp-server-systemd DO NOT INSTALL"
DESCRIPTION = "The bats based tests. For testing the rpm itself the env variables TEST_CONTAINER \
TEST_BINARY must be set accordingly. \
 \
NOTE: THIS PACKAGE IS FOR TESTING PURPOSES ONLY. \
IT IS INTENDED FOR USE BY QUALITY ASSURANCE AND REQUIRES A \
DEDICATED TESTING ENVIRONMENT. \
 \
DO NOT INSTALL ON A PRODUCTION SYSTEM!"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "mcp-server-systemd-testsuite-0.3.4-2.3.noarch.rpm"
RPM_HASH = "21fd6f66bed0f466d842e61af6d96424b331b292eeddd82b9b8e633eaa01478b7b37b7bece2f3b605bbcebe85fdcc371f4310e507bdcf1d922cd31b6da6d7a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcp-server-systemd-testsuite"

RDEPENDS:${PN} += "bats \
go \
man \
podman"

inherit rpm
