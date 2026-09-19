SUMMARY = "Kubectl plugin to interactively proxy Kubernetes Services with ease"
DESCRIPTION = "Kubetap is a kubectl plugin that enables an operator to easily deploy intercepting proxies for Kubernetes Services."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "kubetap-0.1.4-1.27.aarch64.rpm"
RPM_HASH = "f7ed014ebc4dc5099133cef9e21586f2fea3f1d645c6a4cd6f7f31669e35e852157590d05fc6a4af5f5f03e65954a84b7fd01c879414761ad41f3742f82d3a05"

RPROVIDES:${PN} += "kubetap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
