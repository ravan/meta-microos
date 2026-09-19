SUMMARY = "Curses based terminal UI for Kubernetes clusters"
DESCRIPTION = "K9s provides a curses based terminal UI to interact with your Kubernetes \
clusters. The aim of this project is to make it easier to navigate, observe \
and manage your applications in the wild. K9s continually watches Kubernetes \
for changes and offers subsequent commands to interact with observed \
Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "0.51.0"

RPM_NAME = "k9s-0.51.0-1.4.aarch64.rpm"
RPM_HASH = "3e311cba099011bb5b092ac3fa88ea984ea06a581adc8736a8e9d887cf6c410c8a9e537d56ffdbf40efb8b2c8df2a534418d13e6d80f75c2169cf9f81f807bfc"

RPROVIDES:${PN} += "k9s"

RDEPENDS:${PN} += ""

inherit rpm
