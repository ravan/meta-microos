SUMMARY = "Installer for k3s optimised for openSUSE MicroOS"
DESCRIPTION = "Based on the official upstream k3s install.sh, this k3s-install \
package provides a curated, MicroOS-optimised, securely delivered \
alternative to running a script directly from the internet. \
 \
k3s is a container orchestration system for automating application \
deployment, scaling, and management. It is a Kubernetes-compliant \
distribution that differs from the original Kubernetes (colloquially \
'k8s') in that: \
 \
  * Legacy, alpha, or non-default features are removed. \
  * Most in-tree plugins (cloud providers and storage plugins) were \
    removed, since they can be replaced with out-of-tree addons. \
  * sqlite3 is the default storage mechanism. \
    etcd3 is still available, but not the default. \
  * There is a new launcher that handles a lot of the complexity of \
    TLS and options."
LICENSE = "Apache-2.0"

PV = "1.24.3+k3s1"

RPM_NAME = "k3s-install-1.24.3+k3s1-1.11.aarch64.rpm"
RPM_HASH = "5033a5b4d49d975a0801d54cf8e7b9a5c65a9f11499eea15ebc17b6079acc72654d1dc8c6b118e7a18f71e687bbecfc6e1b40d83f939447c825de6d4fc323ada"

RPROVIDES:${PN} += "k3s-install"

RDEPENDS:${PN} += "/usr/bin/sh \
iptables \
k3s-selinux"

inherit rpm
