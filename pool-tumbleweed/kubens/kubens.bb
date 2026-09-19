SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubens is a utility to switch between Kubernetes namespaces. \
 \
USAGE: \
  kubens                    : list the namespaces \
  kubens <NAME>             : change the active namespace \
  kubens -                  : switch to the previous namespace \
  kubens -c, --current      : show the current namespace"
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubens-0.11.0-2.3.aarch64.rpm"
RPM_HASH = "0c748f888d67f8efcfceb0827d68e696ac2607c542d105cffbc2f5059077540e1857b2f746ca54b8bc36636badd3480dee3c41bfdfce9a2b7fc58049c89fd3e3"

RPROVIDES:${PN} += "kubens"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
