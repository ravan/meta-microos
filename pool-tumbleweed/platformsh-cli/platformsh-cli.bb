SUMMARY = "Tool for managing Platform.sh services from the command line"
DESCRIPTION = "The Platform.sh CLI is the official command-line interface for Platform.sh. \
Use this tool to interact with Platform.sh projects, and to build them \
locally for development purposes."
LICENSE = "MIT"

PV = "3.67.2"

RPM_NAME = "platformsh-cli-3.67.2-1.14.noarch.rpm"
RPM_HASH = "59249f357ace11906886d2306efad03b698f23534294967f20b7f26de95dababf7531a1883c90c178212467bba8eaca9ca539a3cc723e6c095b6714c3e75bd82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "platformsh-cli"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
php"

inherit rpm
