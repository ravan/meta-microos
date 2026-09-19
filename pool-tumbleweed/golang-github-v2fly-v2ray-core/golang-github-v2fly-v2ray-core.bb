SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy. \
 \
This package provide source code for v2ray-core"
LICENSE = "MIT"

PV = "5.53.0"

RPM_NAME = "golang-github-v2fly-v2ray-core-5.53.0-2.1.noarch.rpm"
RPM_HASH = "5c80c0938eb3db9f2bb78c4314aba6e4983aced92a6403c9c6c1190ccc8be0672fafd44cf9fb774670bf0c8deec6066ac2a8522b7b2fb1074b99948addedede8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-v2fly-v2ray-core"

RDEPENDS:${PN} += ""

inherit rpm
